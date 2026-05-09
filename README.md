# Bài 4 — Matrix strategy & đường dẫn đa nền tảng

## Ý tưởng

- Workflow chạy `mvn verify` trên **ubuntu-latest**, **windows-latest**, **macos-latest**.
- **Không** hard-code `\` hay `/`: dùng `java.nio.file.Path` / `Paths.get` trong `PathResolver` và trong test so sánh với `Paths.get(a,b).toString()` để luôn đúng trên mọi OS.
- **Quan sát lỗi kiểu “It works on my machine”**: ban đầu có thể viết test kiểu `assertEquals("data/report.txt", ...)` hoặc ghép chuỗi với `"\\"` — trên Windows vs Linux sẽ fail (ghi lại trong báo cáo/lab log). Bản nộp này đã refactor để pass matrix.

## Chạy local

```bash
chmod +x run.sh
./run.sh
```
