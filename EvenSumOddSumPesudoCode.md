Even Sum and Odd Sum Pesudo Code:-

Input = number

evenSum = 0
oddSum = 0

While number is greater than 0

LastDigit = number%10
if(LastDigit is even)
   evenSum = evenSum + LastDigit
else
  oddSum = oddSum + LastDigit

number = number / 10

print(evenSum oddSum)