# Ref Select Service

## Gioi thieu
Du an Spring Boot cung cap API khoi tao man hinh chon lien he (Contact Selection). API tra ve danh sach vung (rgon) va HTML hoan chinh cua man hinh de hien thi ban dau.

## Cong nghe
- Java 17
- Spring Boot 3.2.5 (Web, Data JPA, Validation, Thymeleaf)
- Flyway (migration)
- MySQL (runtime), H2 (test)
- Maven

## Cau truc thu muc
- `src/main/java/com/example/refselect`: controller, service, dto, entity, repository
- `src/main/resources/db/migration`: script Flyway (`V1__create_tables.sql`, `V2__seed_data.sql`)
- `src/main/resources/templates/ref_select.html`: template HTML
- `README_API.md`: tai lieu API chi tiet

## Cai dat va chay he thong

### 1) Yeu cau
- Java 17
- Maven 3.x
- MySQL 8.x (hoac tuong thich)

### 2) Cau hinh DB
Mac dinh file `src/main/resources/application.yml` dang su dung:
- DB: `ref_select`
- User: `sa`
- Pass: `root`
- Port: `3306`

Ban can tao DB va cap quyen tuong ung, hoac chinh sua `application.yml` theo moi truong cua ban.

### 3) Chay ung dung
```bash
mvn spring-boot:run
```
Ung dung se chay tai: `http://localhost:8080`

Flyway se tu dong chay migration va seed du lieu khi khoi dong.

## Chay test
```bash
mvn test
```
Cac test su dung H2 theo cau hinh trong `src/main/resources/application-test.yml`.

## API
Xem chi tiet trong `README_API.md`.

Endpoint chinh:
- `POST /purchase/event_entry/event_info/ajax/ref_select_load`

## Luu y
- Neu co loi ket noi DB, hay kiem tra thong tin trong `application.yml`.
- Phan template HTML duoc render trong `ref_select.html`.
