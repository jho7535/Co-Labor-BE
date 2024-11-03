# Co-Labor 기여 가이드라인

[English Version](https://github.com/Co-Labor-Project/Co-Labor-BE/blob/develop/CONTRIBUTING-EN.md)

Co-Labor 프로젝트에 관심을 가져 주셔서 감사합니다! 이 문서는 프로젝트에 기여하기 위한 지침을 제공합니다. 오픈 소스로 프로젝트를 성장시키는 데 많은 도움을 주시기 바랍니다.

## 📌 기여 전 준비 사항

기여하기 전에 각 리포지토리의 README 파일을 참고하여 로컬 환경 설정과 필요한 종속성 설치 방법을 확인하세요.

- [프론트엔드 리포지토리 README](https://github.com/Co-Labor-Project/Co-Labor-FE/blob/develop/README.md)
- [백엔드 리포지토리 README](https://github.com/Co-Labor-Project/Co-Labor-BE/blob/develop/README.md)

## 🛠️ 기여할 수 있는 영역 (고민해야할 듯..)

- **백엔드 확장**: Spring Framework와 MySQL을 사용하여 API와 데이터베이스 구조를 개선할 수 있습니다.
- **버그 리포트 및 수정**: 프로젝트의 버그를 찾아 이슈를 생성하거나 직접 수정할 수 있습니다.
- **문서 개선**: README나 기타 문서를 보완하여 사용성과 이해도를 높이는 데 기여할 수 있습니다.

## 📝 이슈 작성 가이드

새로운 기능이나 버그 수정을 위한 Issue를 작성할 때는 아래의 템플릿을 참고해 주세요:

### Issue 템플릿: 기능 개발

1. **기능 설명 📘**: 기능에 대한 명확하고 간결한 설명을 작성합니다.
2. **구현 방법 🛠**: 이 기능을 어떻게 구현할 것인지에 대한 개략적인 방법을 설명합니다.
3. **추가 정보 📎**: 기능 개발에 대한 추가적인 맥락이나 참고 자료가 있다면 작성합니다.

## 🚀 브랜치 및 Pull Request 작성 가이드

1. **브랜치 생성**: Issue 번호를 반영한 브랜치 이름으로 새로운 기능 개발을 시작합니다.

   - 브랜치 네이밍 규칙: `feat/#이슈번호` 또는 `fix/#이슈번호`
   - 예: `feat/#69` 또는 `fix/#45`

   ```bash
   git checkout -b feat/#이슈번호
   ```

2. **커밋 메시지 작성**: 아래의 커밋 메시지 규칙에 따라 명확하게 작성합니다.

   - `feat`: 새로운 기능에 대한 커밋
   - `fix`: 버그 수정에 대한 커밋
   - `build`: 빌드 관련 파일 수정 / 모듈 설치 또는 삭제에 대한 커밋
   - `chore`: 그 외 자잘한 수정에 대한 커밋
   - `ci`: CI 관련 설정 수정에 대한 커밋
   - `docs`: 문서 수정에 대한 커밋
   - `style`: 코드 스타일 혹은 포맷 등에 관한 커밋
   - `refactor`: 코드 리팩토링에 대한 커밋
   - `test`: 테스트 코드 수정에 대한 커밋
   - `perf`: 성능 개선에 대한 커밋

3. **Pull Request 생성**: PR 제목과 설명에 Issue 번호를 명시하고, 필요한 경우 기능 설명과 구현 방법을 포함합니다.

   - **PR 제목 예시**: `[feat] #69 - Add search functionality`
   - **PR 설명**: PR 설명에는 해당 Issue에 대한 간단한 요약, 주요 변경 사항, 구현 방식 등을 포함하여 리뷰어가 쉽게 이해할 수 있도록 작성합니다.

4. **리뷰 및 피드백**: PR 생성 후 GitHub의 코멘트를 통해 팀과 협의하여 필요한 피드백을 반영합니다.

   - 피드백 반영이 완료되면, PR에 해당 변경 사항을 커밋하고 리뷰어에게 다시 확인 요청을 합니다.
   - 모든 리뷰어의 승인을 받으면, 최종적으로 PR을 병합할 수 있습니다.

## 📘 코드 스타일 가이드

- **백엔드**: Spring 가이드라인에 맞춰 네이밍과 코드 구조를 유지합니다.

## 🗣️ 커뮤니케이션

기여와 관련된 논의가 필요할 때는 GitHub 이슈 및 PR의 코멘트를 통해 문의해 주세요.

감사합니다! Co-Labor 프로젝트에 많은 기여 부탁드립니다.