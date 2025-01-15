# BOJ
----
### 01.10

* **문제 풀이**
  - 1406 에디터
  - 10845 큐
  - 1158 요세푸스(원에서 모든 사람이 없어질때까지 K번째 사람 제거)
  - 10866 덱(Deque)
  - 17413 (<>) 태그 안은 그대로 출력, 나머지는 단어 단위로 뒤집어서 출력

* **회고**  
  1 :    
  입출력: Scanner    
  자료구조: ArrayList    
  - 커서는 idx변수로 관리    
  --> 시간초과    


  2 :    
  입출력: Buffer    
  이하 동일    
  --> 시간초과    
  --> 자료구조 변경 필요    

  리스트의 시간복잡도? -> 삽입 삭제의 경우 O(n)이 걸림    
  ★Worst Case: N번의 명령 * O(n) = O(n^2)    

  --> 스택의 경우 모든 연산이 O(n), 시간 복잡도를 O(n)으로 줄일 수 있나?    
  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ    
  https://minhamina.tistory.com/17    
  1.    
  빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList를 사용하는 것이 바람직하지 않다.    
  이런 경우에는 LinkedList를 사용하는 것이 더 좋다.    
  그러나 인덱스 검색이나, 맨 마지막에 객체를 추가하는 경우에는 ArrayList가 더 좋은 성능을 발휘한다.    

  2.    
  LinkedList는 인접 참조를 링크해서 체인처럼 관리한다.    

  쉽게 말하자면 각 요소는 이전과 다음 요소의 정보를 가지고 있다.    

  그렇기에 ArrayList와 달리 임시 배열을 생성할 필요가 없고, 이전과 다음 요소의 정보를 활용하여 삽입/삭제를 처리할 수 있기에 유리하다.    

  3.    
  하지만 결국 이 문제는 삽입/삭제가 빈번한데 더 빠른 처리를 요구하고 있다.    

  즉 검색 시에는 인덱스를 통해 접근하는 것이 아니기에 최악의 경우는 모든 요소를 다 살펴봐야 하기 때문에 불리했다.    

  결국 ArrayList보다 유리하다고는 하나 결국 삽입/삭제 시 그 인덱스에 바로 접근하는 것이 아니라, head와 tail을 제외하곤 하나하나 살펴보며 찾아가서 처리하기 때문에 완전히 효율적이라고 볼 수 없다.    

  ★즉 O(N)의 시간 복잡도를 가지게 되었고 커서 기준 거리 1 이내로 연산이 행해져야 하는 문제이기 때문에 모든 연산이 O(1)이여야 한다.    
  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ    
  3 :    
  입출력: Buffer br, bw    
  자료구조: LinkedList + ListIterator (커서 자체가 존재, 인덱스를 바탕으로 검색하지 않아도 된다. 연산의 시간복잡도 O(1))    
  --> 성공    


  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ    
  4 : ★    
  입출력: Buffer br, bw    
  자료구조: Stack 2개, 스택 사이를 커서로 간주 (스택의 연산은 모두 O(1))    
  --> 성공    

----------
### 01.13

* **문제 풀이**
  - 10799 - (레이저로 파이프 자르기)
    
* **회고**  
  1:
  입출력 - Buffer
  자료구조 - ArrayList, Stack
  --> 시간초과
  + lowerBound        
  https://winterlimited.tistory.com/8    


----------
### 01.14

* **문제 풀이**
  - 17298 - 오큰수
  - 17299 - 오등큰수
  - 1935 - 후위표기식2
  - 1936 - 후위표기식
    
* **회고**  
  1:
  배열 전체 비교 (n^2) vs 스택에 이전 값 넣어놓고 비교 (n)    