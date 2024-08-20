Total Salary Pesudo Code.

Input = basic
Input = grade

hra = 20% (0.2 * basic)
da = 50% (0.5 * basic)

if(grade == 'A')
   allowance = 1700
elseif(grade == 'B')
  allowance = 1500
else
  allowance = 1300

pf = 11% (0.11 * basic)

TotalSalary = basic + hra + da + allowance - pf

calculatedSalary = Round(TotalSalary) ---> Round is library function

print(CalculatedSalary)