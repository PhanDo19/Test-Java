# Ref Select Service

## Giới thiệu
Dự án Spring Boot cung cấp API khởi tạo màn hình chọn liên hệ (Contact Selection). API trả về danh sách vùng (rgon) và HTML hoàn chỉnh của màn hình để hiển thị ban đầu.

## Công nghệ
- Java 17
- Spring Boot 3.2.5 (Web, Data JPA, Validation, Thymeleaf)
- Flyway (migration)
- MySQL (runtime), H2 (test)
- Maven

## Cấu trúc thư mục
- `src/main/java/com/example/refselect`: controller, service, dto, entity, repository
- `src/main/resources/db/migration`: script Flyway (`V1__create_tables.sql`, `V2__seed_data.sql`)
- `src/main/resources/templates/ref_select.html`: template HTML
- `README_API.md`: tài liệu API chi tiết

## Cài đặt và chạy hệ thống

### 1) Yêu cầu
- Java 17
- Maven 3.x
- MySQL 8.x (hoặc tương thích)

### 2) Cấu hình DB
Mặc định file `src/main/resources/application.yml` đang sử dụng:
- DB: `ref_select`
- User: `sa`
- Pass: `root`
- Port: `3306`

Bạn cần tạo DB và cấp quyền tương ứng, hoặc chỉnh sửa `application.yml` theo môi trường của bạn.

### 3) Chạy ứng dụng
```bash
mvn spring-boot:run
```
Ứng dụng sẽ chạy tại: `http://localhost:8080`

Flyway sẽ tự động chạy migration và seed dữ liệu khi khởi động.

## Chạy test
```bash
mvn test
```
Các test sử dụng H2 theo cấu hình trong `src/main/resources/application-test.yml`.

## API
Xem chi tiết trong `README_API.md`.

Endpoint chính:
- `POST /purchase/event_entry/event_info/ajax/ref_select_load`

## Ghi chú
- Response API mẫu được lưu tại `response.json`.
- Nếu có lỗi kết nối DB, hãy kiểm tra thông tin trong `application.yml`.
- Phần template HTML được render trong `ref_select.html`.
