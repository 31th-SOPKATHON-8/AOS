


https://user-images.githubusercontent.com/84129098/202875650-713939a1-bd79-4e28-87e1-45d3031d5d0a.mov


# 찌릿

### 눈치있는 브랜드 소비를 위한 아티클 큐레이션 및 커뮤니티 서비스

- 이슈를 상기시켜서 브랜드에 대한 정보를 알려, 사람들로 하여금 현명한 소비를 이끌고, 사람들의 목소리가 하나로 모여 기업의 변화를 이끌어내고자 기획된 서비스

# 우리팀 사진

### 안드
![image](https://user-images.githubusercontent.com/84129098/202861951-1c8574f8-077f-48bb-965d-87d7f820857c.png)

### 전체
![image](https://user-images.githubusercontent.com/84129098/202861961-5734ca2b-cadd-4065-825f-a0b56c5fc872.png)



# 개발 역할 담당

- 영주 : 기초세팅, 찜 프래그먼트, 브랜드 액티비티

- 준우 : 바텀네비게이션, 홈 프래그먼트, 튜토리얼 액티비티

- 유진 : 포스팅 액티비티

# 코딩컨벤션

| 분류 | 네이밍 규칙 | 예시 | 비고 |
| --- | --- | --- | --- |
| xml id명 | [view] [where] [what] | tv_main_comment | 뷰 대문자 따서 만들기 (바텀네비 제외)
(tv, iv, rcv, fcv, btn) |
| xml명 | [what] [where] | activity_main
item_comment |  |
| 변수명 | [where] [what] | val homeComment | Boolean의 경우 is~로 변수명 짓기 |
| class명 | [where] [what] | class HomeActivity |  |
| string명 | [where] [what] | home_comment | 중복 허용x 다같이 쓰는 것 같으면 where 생략 |
| drawable - selector | selector [where] [what] | selector_home_button |  |
| drawable - shape | shape [color] [fill/line] [radius num] [shape] | shape_red_fill_5_rect | 겹치면 그거 가져다 쓰기 (풀받을 때 겹치면 하나만 남기기) |
| drawable - icon | ic [where] [what] | ic_home_setting |  |
| 함수명 | camel case | fun setSettingClickListener() | 초기점에 무슨 기능인지 명확하게 표기 (init, set, get, post, put, is, check 등등) |
| style, color | 디자이너가 보내주는 대로 |  |  |
