# 녹양스피곳크래프트버킷
로고파일 다운로드: https://github.com/user-attachments/assets/ca90d992-5590-4373-8e49-16e0610cf991

NogyangSpigot is a Fork Of Paper and Spigot with Glowkit Patches and Sponge API, Rainbow API(PluginReference In Project Rainbow) Integrated on it, Made By Student of Nogyang Middle School.\
Paper와 Spigot을 포크한 뒤 스펀지 API, 레인보우 API, 글로우킷 패치를 추가한 서버 버킷.\
Copyright (C) 2022-2025, Approximaster Studios 2004. All Rights Reversed.\
녹양중 학생이 만들었습니다.

# 플러그인 작동가능:
Reobf 플러그인, Mojmap 플러그인, 재난독 매핑과 바닐라 매핑에서 모두 동작합니다.

# 컴파일 절차
NogyangSpigotCraftBukkit JAR는 액션에서만 배포되기 때문에, 깃허브 계정이 없는 경우에는 직접 컴파일해야 합니다.\
`gradlew applypatches`로 패치를 적용한뒤\
`gradlew create(Reobf/Mojmap)Paperclipjar` 명령으로 직접 빌드해야 합니다.\
빌드되는 JAR:
```
NogyangSpigotCraftBukkit-Paperclip-25w07a-R0.1-SNAPSHOT-Reobf.jar (페이퍼 전용 버전 관리자 + 스피곳 매핑, 메인 파일)
NogyangSpigotCraftBukkit-Bundler-25w07a-R0.1-SNAPSHOT-Reobf.jar (바닐라 버전 관리자 + 스피곳 매핑)
NogyangSpigotCraftBukkit-Paperclip-25w07a-R0.1-SNAPSHOT-Mojmap.jar (페이퍼 전용 버전 관리자 + 바닐라 매핑)
NogyangSpigotCraftBukkit-Bundler-25w07a-R0.1-SNAPSHOT-Mojmap.jar (바닐라 버전 관리자 + 바닐라 매핑)
```

# 안내
Spigot API와 Paper API가 점점 분리되면서, Paper에는 Spigot 기능이 추가되지 않습니다.\
현재 스피곳과 페이퍼를 이중 지원하는 시스템은 녹양스피곳 밖에 없으며, 요즘은 재난독화 서버가 아닌 바닐라 매핑 서버를 쓰는 추세입니다.\


| 스피곳 플러그인 | 페이퍼 플러그인 | 스펀지 플러그인 |
|-|-|-|
| 67,480 | 1,744 | 581 |

# 서버 실행
`java -jar 아까 컴파일한 JAR`

# 2025년 매퍼 변경
2025년, NogyangSpigot은 공식적으로 Mojmap에서만 사용되던 플러그인 매퍼와 서버 매퍼를 Reobf 사용자에게도 풀기로 결정했습니다.
이제부터는 스냅샷/릴리즈 출시시 공식적으로 Reobf에서 모던 플러그인을 사용할 수 있습니다. 단 로딩 시 매핑 되어야 한다는 점에 유의하세요.

# 구조
```          
버킷+스피곳+페이퍼+레인보우 통합 API(녹양이API) -> 중앙 서버(NogyangSpigotCraftBukkit-Server) <- (버들이API)글로우스톤+스펀지 API
녹양이API: NogyangSpigot-API의 공식 명칭
버들이API: BeodeulSponge-API의 공식 명칭
```
