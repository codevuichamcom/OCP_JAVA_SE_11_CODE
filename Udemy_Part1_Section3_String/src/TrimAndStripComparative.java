public class TrimAndStripComparative {
    public static void main(String[] args) {
        // Giả sử bạn có một chuỗi chứa các khoảng trắng ở đầu và cuối,
        // và có một số ký tự khoảng trắng Unicode khác giữa các từ.
        String input = "\u2005   This is a strip vs trim example.   \u2005";

        // Sử dụng strip() để loại bỏ khoảng trắng từ đầu và cuối, cũng như các ký tự khoảng trắng Unicode.
        String strippedResult = input.strip();

        // Sử dụng trim() để chỉ loại bỏ khoảng trắng từ đầu và cuối (không xử lý Unicode whitespace).
        String trimmedResult = input.trim();

        // In kết quả để so sánh.
        System.out.println("Original String: '" + input + "'");
        System.out.println("Stripped Result: '" + strippedResult + "'"); // Stripped Result: 'This is a strip vs trim example.'
        System.out.println("Trimmed Result: '" + trimmedResult + "'"); // Trimmed Result: '    This is a strip vs trim example.    '

    }
}
