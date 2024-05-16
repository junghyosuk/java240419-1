package xyz.itwill.util;

//java.util.regex 패키지 : 정규표현식 관련 기능을 제공하는 Java 자료형이 선언된 패키지

//정규표현식(RegualarExpression) : 메타문자(Meta Character), 회피문자(Escape Character)등을
//사용해 일정한 패턴의 문자열을 표현하기 위한 표현식 - 사용자 입력값에 대한 검증 처리
/*
^문자 : 문자(열)로 시작됨을 의미
문자$ : 문자(열)로 종료됨을 의미
. : 임의의 문자 하나를 의미(\ 문자 제외)
[문자1문자2문자3] : 나열된 문자 중 하나를 의미
[^문자1문자2문자3] : 나열된 문자를 제외한 문자 중 하나를 의미
[문자1-문자2] : [문자1]부터 [문자2] 범위의 문자 중 하나를 의미
(문자열1|문자열2|문자열3) : 나열된 문자열 중 하나를 의미
문자열+ : 문자(열)이 1번이상 반복됨을 의미
문자열* : 문자(열)이 0번이상 반복됨을 의미
문자열? : 문자(열)이 0번 또는 1번 존재함을 의미
문자열{숫자} : 문자(열)이 [숫자]만큼 반복됨을 의미
문자열{숫자1,숫자2} : 문자(열)이 [숫자1]부터 [숫자2]만큼 반복됨을 의미
(?!)문자열 : 문자열에서 대소문자를 구분하지 않음을 의미
(?=문자열) : 문자열이 반드시 포함됨을 의미
(!=문자열) : 문자열이 반드시 포함되지 않음을 의미
*/

/*
\s : 공백이 있는 문자열을 의미
\S : 공백이 없는 문자열을 의미
\w : 영문자, 숫자, 특수문자(_)의 문자로만 구성된 문자열을 의미
\W : 영문자, 숫자, 특수문자(_)의 문자를 제외한 문자로 구성된 문자열을 의미
\d : 숫자 형태의 문자로만 구성된 문자열을 의미
\D : 숫자 형태의 문자를 제외한 문자로 구성된 문자열을 의미
\메타문자 : 메타문자를 일반문자로 표현됨을 의미 - ex) \. : 문자 .
*/

public class RegualarExpressionApp {

}
