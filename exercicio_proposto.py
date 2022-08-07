import math

val = input("msg")
val = int(val)

val2 = math.pow(val,3)

if val2 < 100:
    print(f"{val2} e menor que 100!")
else:
    print(f"{val2} e maior que 100!")