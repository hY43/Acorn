'''
Created on 2016. 9. 21.

@author: kitcoop
'''

print("console 자료 출력");
print(format(1.5678, '10.3f')); # 정수부 10자리, 소수부 3자리를 반올림하여 출력

print("내 나이는 %d입니다." %20);
print("내 이름은 %s입니다." %"홍길동");

# Q1, 나의 이름은 XXX이고 나이는 XX 입니다.
print("나의 이름은 %s이고 나이는 %d입니다." %("홍길동", 20));

print("삼숭의 최신 스마트폰 {0} os는 {1}".format("note7", "누가"));
print("이름 {1} 나이 {0} 나이 {0} 나이 {0}".format(20, "홍길동" ))