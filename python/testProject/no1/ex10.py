'''
if 문
'''

var = 0;
# 파이썬은 블럭을 들여쓰기로 결정됨
if var >= 3:
    print("3 이상의 숫자입니다.");
elif var == 0:
    print("0입니다.");
else:
    print("3 이하의 숫자입니다.");

print("========================================");

money = 1000;
age = 20;
if money >= 500:
    item = "apple";
    if age <= 30:
        msg = "young";
    else:
        msg = "old";
else:
    item = "banana";
    if age <= 30:
        msg = "young";
    else:
        msg = "old";
        
print(item, msg);

score = 100;
if 90 <= score <= 100:
    print("A");
elif score >= 80:
    print("B");
elif score >= 70:
    print("C");
elif score >= 60:
    print("D");
else:
    print("F");
        