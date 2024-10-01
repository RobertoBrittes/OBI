public class StringTest {
    public static void main(String[] args) {
        String txt = "Roberto";
        String txtReverso = "";

        txt = txt.toLowerCase();
        for (int i = 0; i < txt.length(); i++) {
            txtReverso = txt.charAt(i) + txtReverso;
        }
        txtReverso = txtReverso.toLowerCase();
        
        System.out.println(txtReverso);
    }
}
