def getChange(price, tender)
    money = [10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1]
    # Initialize hash with money denominations as keys
    # and 0 as value
    change = Hash[ *money.collect { |v| [ v, 0 ] }.flatten ]

    remainder = tender - price

    if remainder < 0
        puts 'Too little money.'
        return
    end

    # Go in descending order
    change.keys.sort.reverse.each do |key|
        while remainder >= key
            remainder -= key
            change[key] += 1
        end
    end
    change
end

def readDecimal
    inString = gets.chomp
    if inString.include? '.'
        inString = inString.delete '.'
    else
        inString << '00'
    end
    Integer(inString)
end

def printChange(change)
    change.keys.sort.reverse.each do |key|
        if change[key] == 0
            next
        end
        if key / 100 != 0
            print(key/100, ".00 : ", change[key], "\n")
            STDOUT.flush
            next
        end
        puts(sprintf("0.%02d : %d", key % 100, change[key]))
        STDOUT.flush
    end
end

def main
    print "What did it cost? "
    price = readDecimal
    print "What did you pay? "
    tender = readDecimal
    puts "Your change is :"
    printChange(getChange(price, tender))
end

main
