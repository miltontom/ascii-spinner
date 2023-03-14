public class AsciiSpinner {
	public static void main(String[] args) {
		asciiSpinner();
	}

	static void asciiSpinner() {
		char[] chars = {'-', '\\', '|', '/'};

		while (true) {
			for (char ch: chars) {
				System.out.print(ch);
				try {
					Thread.sleep(150);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				System.out.print('\b');
			}
		}
	}
}