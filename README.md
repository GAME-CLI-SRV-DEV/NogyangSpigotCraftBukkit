# NogyangSpigotCraftBukkit / 녹양스피곳크래프트버킷
Paper와 Spigot을 포크한 뒤 스펀지를 추가한 서버 구현체.\
Copyright (C) 2022-2025, Approximaster Studios 2004. All Rights Reversed.\
우리는 종이로 싸여있는 반짝이는 무지개 해면 담긴 양동이를 들고 행진하리라.
# Spigot으로부터 떨어져나가지 않겠습니다.
2024년 12월 13일, Paper가 Spigot을 하드포크, Spigot의 업데이트를 반영하지 않음에 따라 Paper와 Spigot은 떨어져나가고 있습니다.\
우리는 떨어져나가지 않을 겁니다. 자기 버전 만드는 이 없더래도 떨어져나가지 않을 겁니다.

# 컴파일 절차
NogyangSpigotCraftBukkit JAR는 배포되지 않기 때문에, 직접 컴파일해야 합니다.
`gradlew applypatches`로 패치를 적용한뒤\
`gradlew create(Reobf/Mojmap)Paperclipjar` 명령으로 직접 빌드해야 합니다. 

# 서버 실행
대부분의 경우는 바닐라 매핑 Paperclip을 사용하지만, NogyangSpigot의 경우 Reobf를 사용합니다. 모던 플러그인이 이 환경에서도 작동하는지 궁금하네요.
