def fib(n)
    a = 0
    b = 1
    1.upto(n - 2) do
        c = b
        b += a
        a = c
    end
    return b
end

print "Enter fibonacci number: "
n = gets.chomp
print "Answer is %d.\n" % fib(Integer(n))
