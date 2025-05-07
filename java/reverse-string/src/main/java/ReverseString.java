class ReverseString {

    String reverse(String inputString) {
      int i, len = inputString.length();
      StringBuilder dest = new StringBuilder(len);

      for (i = (len - 1); i>= 0; i--) {
        dest.append(inputString.charAt(i));
      }
      return dest.toString();
    }
}
