# FIVE-ANDROID

## ๐ ์๋น์ค์ด๋ฆ

### ๐ ๋ก๊ทธ์ธ์  LOG:IN U ๐

```
 ๐ก ์๋น์ค ํ์ค ์๊ฐ : ํ์ธ์ ์ผ์์ ์ด์๋ณด๋ ์๋น์ค
```

## Default Branch

develop branch

## ๊ฐ๋ฐ ๋ด๋น ๋ถ๋ถ

| ์ด๋ฆ | ๋ด๋น|
| --- | --- |
| ๋ฌธ๋ค๋น | MypageFragment xml ํ์ผ | ViewApater ๊ตฌํ | ๋ฆฌ์ฌ์ดํด๋ฌ๋ทฐ ๊ตฌํ | ์๋ฒ์ฐ๊ฒฐ |
| ๋ฐํ์  | HomeFragment ๋ทฐ | Daily Adatper ๊ตฌํ | ํด์ผํ  ๋ฆฌ์คํธ ์ค์ฒฉ ๋ฆฌ์ฌ์ดํด๋ฌ๋ทฐ ๊ตฌํ | Response data ์์ฑ| ์๋ฒ ํต์  ์ฐ๊ฒฐ|
| ์ฐ์ง์ค | WriteActivity ๊ตฌํ | ๋ฆฌ์คํธ ์ถ๊ฐ ๊ตฌํ | ์๋ฒ ํต์  ์ฐ๊ฒฐ| 

### HomeFragment
๋ค๋ฅธ ์ฌ๋์ ์ผ์์ recyclerview๋ก ๋ณด์ฌ์ค๋ค. ๋ฐ์ดํฐ๋ api ์๋ฒ ์ฐ๊ฒฐ์ ํตํด ๋ฐ์์จ ๋ฐ์ดํฐ๋ฅผ ์ฐ๊ฒฐํ๋ค.
## WriteActivity
๊ณต์ ํ  ๋์ ์ผ์์ ์์ฑํ๋ค. ์ด๋ ์ผ์ ๋ฐ์ดํฐ๋ 3~5๊ฐ๋ก ์ ํํ์ฌ ์๋ฒ๋ก ์ ๋ฌํ๋ค. 3๊ฐ๊ฐ ์๋๋ค๋ฉด ํ๋ฉด์ด ๋์ด๊ฐ์ง ์๋๋ก ์ค์ ํ๋ค.

## MyPageFragment
๋์ ์ผ์๊ณผ ๋ด๊ฐ ๋ด์ ์ผ์์ viewpager๋ก ๋ํ๋ธ๋ค. ๋ด๊ฐ ์ข์์ ํ ๋ค๋ฅธ ์ฌ๋๋ค์ ์ผ์๊ณผ ๋์ ์ผ์์ ๋ฆฌ์ฌ์ดํด๋ฌ๋ทฐ์ ๋ณด์ฌ์ค๋ค.
์ด๋ ์งํ์๋ฃ ๋ฒํผ์ ํด๋ฆญ์ ๋ค๋ฅธ ์ฌ๋์ ์ผ์์ ๋ช ํผ์ผํธ ์ด์๋์ง์ ๋ํ ํ์์ฐฝ์ด ๋ฌ๋ค.
๋ก๊ทธ์์ ๋ฒํผ ๊ตฌํ 


## Code Convention
[์๋๋ก์ด๋ ์ฝ๋ฉ ์ปจ๋ฒค์](https://github.com/SOPKATHON-FIVE/FIVE-ANDROID/wiki/Android-Coding-Convention)

## Branch Strategy
### Git Flow

๊ธฐ๋ณธ์ ์ผ๋ก Git Flow ์ ๋ต์ ์ด์ฉํ๋ค. ์์ ์์ ์ ์ ํ๋์ด์ผ ํ  ์์์ ๋ค์๊ณผ ๊ฐ๋ค.

```
1. Issue๋ฅผ ์์ฑํ๋ค.
2. feature Branch๋ฅผ ์์ฑํ๋ค.
3. Add - Commit - Push - Pull Request ์ ๊ณผ์ ์ ๊ฑฐ์น๋ค.
4. Pull Request๊ฐ ์์ฑ๋๋ฉด ์์ฑ์ ์ด์ธ์ ๋ค๋ฅธ ํ์์ด Code Review๋ฅผ ํ๋ค.
5. Code Review๊ฐ ์๋ฃ๋๋ฉด Pull Request ์์ฑ์๊ฐ develop Branch๋ก merge ํ๋ค.
6. merge๋ ์์์ด ์์ ๊ฒฝ์ฐ, ๋ค๋ฅธ ๋ธ๋์น์์ ์์์ ์งํ ์ค์ด๋ ๊ฐ๋ฐ์๋ ๋ณธ์ธ์ ๋ธ๋์น๋ก merge๋ ์์์ Pull ๋ฐ์์จ๋ค.
7. ์ข๋ฃ๋ Issue์ Pull Request์ Label๊ณผ Project๋ฅผ ๊ด๋ฆฌํ๋ค.
```

์์ธํ ๊นํ๋ก์ฐ ์ ๋ต์ ๊ฒฝ์ฐ [๋งํฌ](https://github.com/8-seconds/WIKI_FOR_8_SECONDS/blob/main/GitHub/GitFlowAraboza.md)์ฐธ์กฐ
## ๋ ์ด์์ ๊ตฌํ
fragment_home, activity_write, fragment_my_page

<HomeActivity>

<img width="369" alt="33" src="https://user-images.githubusercontent.com/81394850/169671736-4da142c0-7d05-4d69-905e-8443dc720cfc.png">


<WriteActivity>

<img width="369" alt="11" src="https://user-images.githubusercontent.com/81394850/169670258-b5bef2aa-384e-4626-9c8b-3677bad526b4.png">

<MyPageFragment>
 
ํ์ธ์ ์ผ์๋ทฐ

 <img width="369" alt="22" src="https://user-images.githubusercontent.com/81394850/169670348-0ce64379-7342-4b2e-8b12-f734e06795fc.png">
 
 
๋์ ์ผ์
 
<img width="369" alt="10101010" src="https://user-images.githubusercontent.com/81394850/169671948-df687664-3051-4af3-b498-f7dc9b159857.png">


๋ก๊ทธ์์ํญ
 
<img width="369" alt="555555" src="https://user-images.githubusercontent.com/81394850/169671899-2b712db8-d3a5-4447-9d6d-6930cde9b724.png">


