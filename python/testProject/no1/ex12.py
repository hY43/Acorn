'''
제어문 for
for 변수 in 집합타입:
'''

for i in [3,2,1,5,4]:
    print(i, end=" ");
print();

for i in (3,2,1,5,4):
    print(i, end=" ");
print();

for i in {3,2,1,5,4}:
    print(i, end=" ");
print();

print("=======================================");
soft = {"java":"고슬링",
        "python":"귀도 반 로썸",
        "oracle":"레리 엘리슨",
        "문명":"시드마이어"};
        
for i in soft.items():
    print(i[0] + ' : ' + i[1]);

for i in soft.values():
    print(i);
print("=======================================");

# 2단 출력
for n in [2,3]:
    for i in [1,2,3,4,5,6,7,8,9]:
        print("%d * %d = %d" %(n, i, n*i));
print("=======================================");

# Question, 내가 사려는 과일 총액을 구하시오.
print("과일 값 구하기");
price = {'사과':1000, '배':2000, '망고':3000, '감':4000};
my = {'사과':4, '감':2};
bill = 0;

'''
for i in my:
    bill += (my[i]*price[i]);
'''
 
bill = sum(my[i]*price[i] for i in my);
    
print("총 금액: ", bill);

# 1부터 10까지의 누적합 출력

print("누적합 : ", sum(i for i in list(range(1,100))));

print(list(range(1,10,2))); # 1부터 10까지 2씩 증가하며 값을 뽑아와라
print("=======================================");

# Question, 1부터 1000 사이의 값 중 3의 배수들의 누적합을 출력

print(sum(i for i in list(range(0, 1000, 3))));
    