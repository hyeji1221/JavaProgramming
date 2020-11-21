## 자바의 입출력 스트림 종류

### 바이트 입출력 스트림

입출력되는 데이터를 단순 바이트의 스트림으로 처리

ex) 바이너리 파일을 읽는 입력 스트림

- java.io 패키지에 포함
- **InputStream / OutputStream** : 추상 클래스, 바이트 스트림을 다루는 모든 클래스의 슈퍼 클래스
- **FileInputStream / FileOutputStream** : 파일로부터 바이트 단위로 읽거나 저장, 바이너리 파일의 입출력 용도
- **DataInputStream / DataOutputStream** : 자바 기본 데이터 타입의 값을 바이너리 값 그대로 입출력, 문자열도 바이너리 형태로 입출력



### 문자 입출력 스트림

유니코드로 된 문자를 입출력 하는 스트림

ex) 텍스트 파일을 읽는 입력 스트림

- ava.io 패키지에 포함
- **InputStreamReader / OutputStreamWriter** : 바이트 스트림과 문자 스트림을 연결시켜주는 다리 역할
- **FileReader / FileWriter** : 텍스트 파일에서 문자 데이터 입출력
- 유니코드로 된 문자만 입출력하는 스트림 -> 문자로 표현되지 않는 데이터는 다루지 않음

### 버퍼 스트림

#### 바이트 버퍼 스트림

바이트 단위의 바이너리 데이터를 처리하는 버퍼 스트림

- **BufferedInputStream / BufferedOutputStream**

#### 문자 버퍼 스트림

유니코드의 문자 데이터만 처리하는 버퍼 스트림

- **BufferedReader / BufferedWriter**

### File 클래스

파일의 경로명을 다루는 클래스

- java.io.File

파일 이름 변경, 삭제, 디렉터리 생성, 크기 등 파일 관리

- File 객체는 파일 읽고 쓰기 기능 없음





















