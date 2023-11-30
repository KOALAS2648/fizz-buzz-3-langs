def fizz_buzz(number:int)->str:
    if number %3 ==0 and number%5 ==0:
        return "fizz buzz"
    elif number %3==0:
        return "fizz"
    elif number %5 ==0:
        return "buzz"
    else:
        return f"{number}"

number =  1
counter = 0

while counter !=100:
    print(fizz_buzz(number))
    number +=1
    counter+=1