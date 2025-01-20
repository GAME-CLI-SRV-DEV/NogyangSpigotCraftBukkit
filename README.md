# NogyangSpigotCraftBukkit / 녹양스피곳크래프트버킷
![1000016478](https://github.com/user-attachments/assets/ca90d992-5590-4373-8e49-16e0610cf991)

NogyangSpigot is a Fork Of Paper and Spigot with Glowkit Patches and Sponge API, Rainbow API(PluginReference In Project Rainbow) Integrated on it, .\
Paper와 Spigot을 포크한 뒤 스펀지 API, 레인보우 API, 글로우킷 패치를 추가한 서버 버킷.\
Copyright (C) 2022-2025, Approximaster Studios 2004. All Rights Reversed.
 

# We will not diverge from spigot. / Spigot으로부터 떨어져나가지 않겠습니다.
on Dec 13 2024, Paper Hardforked Spigot, and Paper and Spigot is Diverging.\
But we will not Diverge from spigot, whether no one forks Our Bukkit, we will not diverge.\
2024년 12월 13일, Paper가 Spigot을 하드포크, Spigot의 업데이트를 반영하지 않음에 따라 Paper와 Spigot은 떨어져나가고 있습니다.\
우리는 떨어져나가지 않을 겁니다. 우리 버킷의 자기 버전 만드는 이 없더래도 떨어져나가지 않을 겁니다.

# 컴파일 절차
NogyangSpigotCraftBukkit JAR는 배포되지 않기 때문에, 직접 컴파일해야 합니다.\
`gradlew applypatches`로 패치를 적용한뒤\
`gradlew create(Reobf/Mojmap)Paperclipjar` 명령으로 직접 빌드해야 합니다.\
빌드되는 JAR:
```
NogyangSpigotCraftBukkit-Paperclip-1.21.4-R0.1-SNAPSHOT-Reobf.jar (페이퍼 전용 버전 관리자 + 스피곳 매핑, 메인 파일)
NogyangSpigotCraftBukkit-Bundler-1.21.4-R0.1-SNAPSHOT-Reobf.jar (바닐라 버전 관리자 + 스피곳 매핑)
NogyangSpigotCraftBukkit-Paperclip-1.21.4-R0.1-SNAPSHOT-Mojmap.jar (페이퍼 전용 버전 관리자 + 바닐라 매핑)
NogyangSpigotCraftBukkit-Bundler-1.21.4-R0.1-SNAPSHOT-Mojmap.jar (바닐라 버전 관리자 + 바닐라 매핑)
```

# 서버 실행
대부분의 경우는 바닐라 매핑 Paperclip을 사용하지만, NogyangSpigot의 경우 재난독화 Paperclip을 사용합니다. 모던 플러그인이 이 환경에서도 작동하는지 궁금하네요.
