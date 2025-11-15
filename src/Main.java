public class Main {
    public static void main(String[] args) {

        KMPSearch.search(TestCases.shortText(), "abc");
        KMPSearch.search(TestCases.mediumText(), "abcdabcy");
        KMPSearch.search(TestCases.longText(), "aaaaab");
    }
}