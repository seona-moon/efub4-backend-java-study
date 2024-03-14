
# 자바 핵심 개념 정리 1
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
1byte: boolean, byte <br>
2byte: short, char <br>
4byte: int, flaot <br>
8byte: double, long 
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
오버라이딩(Overriding)은 자식 클래스에서 부모 클래스의 메소드를 재정의하는 것을 말하며, 오버로딩(Overloading)은 같은 이름의 메소드나 생성자를 하나의 클래스 내에서 여러 번 정의할 수 있도록 하는 것이다.오버라이딩은 다형성과, 오버로딩은 재사용성과 관련있다. 
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
객체는 데이터와 그 데이터를 조작하는 함수인 메서드를 포함합니다. <br>
객체지향프로그래밍의 핵심 특징으로는 캡슐화, 상속, 다형성이 있으며, 이는 코드의 재사용성을 높이고, 유지 보수를 용이하게 합니다. <br>
캡슐화는 객체의 세부 구현을 숨기고, 상속은 코드를 재사용하며, 다형성은 같은 인터페이스 아래에서 다양한 실행을 가능하게 합니다.
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
인터페이스는 "할 수 있는 일"에 대한 규약을 정의하는 반면, 클래스는 "실제로 일을 수행하는 방법"과 "상태"를 정의합니다. → 인터페이스는 구현을 포함하지 않는 메서드의 집합을 정의하는 반면, 클래스는 메서드의 실제 구현과 상태(필드)를 포함합니다.
인터페이스는 다중 상속이 가능하지만, 클래스는 단일 상속만 허용됩니다(클래스는 여러 인터페이스를 구현할 수 있습니다).
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
가비지 컬렉션이란 메모리 관리 기법 중 하나로 프로그램이 동적으로 할당했던 메모리 영역 중에서 필요없는 영역을 자동으로 찾아내 해제하는 기능입니다. 즉, 동적 할당된 메모리 영역 가운데 더 이상 참조되지 않는 객체들을 메모리 영역을 탐지하고 회수해 프로그래머의 부담을 줄여줍니다. 
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
JAVA의 가장 큰 특징 중 하나는 특정 운연체제(OS)에 종속되지 않는다는 점입니다. 이는 JVM(Java Virtual Machine) 덕분에 가능합니다. 작성된 .java 파일은 Java 컴파일러에 의해 JVM이 이해할 수 있는 .class 파일, 즉 바이트코드로 변환됩니다. JVM의 Class Loader는 변환된 .class 파일을 운영 체제로부터 할당 받은 JVM 전용 메모리인 런타임 데이터 영역(RunTime Data Area)에 동적으로 로딩합니다. 실행 엔진(Execution Engine) 내의 JIT(Just-In-Time) 컴파일러는 런타임 데이터 영역에 로딩된 .class 파일을 기계어로 변환하여 실행합니다. 이 과정을 통해 Java 애플리케이션이 다양한 운영 체제에서도 변경 없이 실행될 수 있게 됩니다.
</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
불변 객체는 생성 후 그 상태가 변경할 수 없는 객체로, 데이터 안정성을 높입니다. final 키워드는 값의 변경, 오버라이딩, 상속을 금지합니다.
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
static 영역 (== class, method 영역) 은 전역변수나 static으로 선언되는 것들을 메모리에 상주시킵니다. 힙 영역은 인스턴스를 생성할 때 생성되는 메모리 형식입니다. 스택 영역은 int, long, boolean 등 기본 자료형을 생성할 때 저장하는 공간으로, 임시적으로 사용되는 변수나 정보들이 저장되는 영역입니다.
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
둘은 저장공간(메모리)에서 차이를 보입니다. <br>
new String()을 사용하면 힙 메모리 영역역에 새로운 객체가 생성되고, 리터럴(" ")을 사용하면 String constant pool에서 해당 리터럴을 찾아 재사용합니다. 
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 람다(lambda)에 대해 알아볼까요?</summary>
<div markdown="1">
람다식은 함수적 프로그래밍 기법으로, 메소드를 간결한 함수 식으로 표현한 것입니다. 자바에서 메서드를 표현하려면 클래스를 정의해야하나, 람다식으로 표현하면 메서드의 이름과 반환값을 생략할 수 있어(익명함수) 코드가 매우 간결해집니다. 
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 스트림(stream)에 대해 알아볼까요?</summary>
<div markdown="1">
스트림은 운영체제에 의해 생성되는 가상의 연결 고리를 의미하며, 다양한 데이터 소스와 목적지 사이에서 중간 매개체 역할을 합니다. 데이터가 스트림을 통해 이동할 때, 프로그램은 데이터의 전체 크기나 구조를 미리 알 필요 없이 한 번에 한 조각씩 데이터를 읽거나 쓸 수 있습니다.
</div>
</details>
<br>
