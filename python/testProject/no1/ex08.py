'''
파이썬: 정규 표현식
기본 모듈에는 지원하지 않으므로 모듈을 추가한다.
'''
import re; # 정규표현식 모듈 추가

ss = '1234 abc가나다라ABC_555_6_77_88 123 엉아 abc';
# 입력 자료 오류 검사할때, 다량의 데이터에서 원하는 데이터를 참조 할때.

print(re.findall('123', ss));
# 혹시 escape 문자를 검색할 수도 있으므로 r을 붙여서 사용
print(re.findall(r'가나다', ss)); # 가나다 검색
print(re.findall(r'[0-9]+', ss)); # 숫자만 검색
print(re.findall(r'[0-9]{3}', ss)); # 숫자 3자리만 검색

# Question1, 연속 2자 이상의 소문자를 출력
print(re.findall(r'[a-z]{2,}', ss));

# Question2, 2자 이상의 한글 출력 
print(re.findall(r'[가-힣]{2,}', ss));