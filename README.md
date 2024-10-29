# chat-web
실시간 채팅 웹

기능
- 웹소켓을 이용한 실시간 채팅
- 멀티스레드를 사용한 다수 이용자 접속
- 중계서버
- 회원 CRUD
- 다른 사용자 찾기 및 친구추가
- 리눅스 서버 운영
- 도커 사용
- CI/CD 파이프 라인
- 외부 IP로부터 접속 허용

사용 기술
- 웹 ui -> React
- 백 엔드 -> Spring Boot
- Database -> MySQL
- 중계서버 -> C
- CI/CD -> Git Actions
- 서버 운영 -> ubuntu

추가 사항
보안 강화: OAuth나 JWT와 같은 강력한 인증 방식을 도입하여 보안을 강화하고, SSL 인증서를 통해 데이터 암호화를 적용하면 좋습니다. 또한, WebSocket 연결에 대한 보안 관리도 필요합니다.

확장성과 부하 분산: 다수의 사용자 접속을 원활하게 처리하기 위해 부하 분산(로드 밸런싱)과 캐싱 전략을 고려해보세요. 예를 들어 Nginx나 Redis 같은 툴을 통해 트래픽을 분산하거나 데이터를 캐싱할 수 있습니다.

로그 및 모니터링: 시스템 운영 중 발생하는 에러 및 성능을 실시간으로 모니터링할 수 있도록 로그 관리 및 모니터링 시스템을 추가해보세요. Prometheus, Grafana, ELK 스택 등이 유용할 수 있습니다.

테스트 자동화: CI/CD 파이프라인에서 코드의 품질을 높이기 위해 자동화된 테스트를 도입해 보세요. 유닛 테스트, 통합 테스트, API 테스트 등을 GitHub Actions와 연동하여 배포 전에 자동으로 실행하게 설정할 수 있습니다.
