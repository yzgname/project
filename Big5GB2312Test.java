package str;

import java.io.UnsupportedEncodingException;

import com.nhn.sapphire.util.TextUtils;

public class Big5GB2312Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "杨志国あいうえお";
		System.out.println(chkBig5GB(s));

	}

	public static boolean chkBig5GB(String str) throws UnsupportedEncodingException {
		for (int i = 0; i < str.length(); i++) {
			boolean res = true;
			byte[] bytes = str.substring(i, i + 1).getBytes("big5");
			if (!str.substring(i, i + 1).equals(new String(bytes, "big5"))) {
				res = false;
			}
			
			String hexValue = TextUtils.toHex(str.substring(i, i + 1), "big5");
			int code = Integer.valueOf(hexValue, 16);
//			System.out.println(hexValue);
//			if (code >= 0x0030 && code <= 0x0039) {
//				// [0]～[9]
//			} else if (code >= 0x0021 && code <= 0x002f) {
//				// [!]～[/]
//			} else if (code >= 0x003a && code <= 0x0040) {
//				// [:]～[@]
//				System.out.println(":");
//			} else if (code >= 0x007b && code <= 0x007e) {
//				// [{]～[~]
//			} else if (code == 0x005b) {
//				// [[]
//			} else if (code >= 0x005d && code <= 0x005f) {
//				// []]～[_]
//			} else if (code >= 0x0041 && code <= 0x005a) {
//				// [A]～[Z]
//			} else if (code >= 0x0061 && code <= 0x007a) {
//				// [a]～[z]
//			} else if (code >= 0x8141 && code <= 0x819e) {
//				// [、]～[◇]
//			} else if (code >= 0x819f && code <= 0x81ac) {
//				// [◆]～[〓]
//			} else if (code >= 0x81b8 && code <= 0x81bd) {
//				// [∈]～[⊃]
//			} else if (code >= 0x81be && code <= 0x81bf) {
//				// [∪]～[∩]
//			} else if (code >= 0x81c8 && code <= 0x81cd) {
//				// [∧]～[∀]
//			} else if (code == 0x81ce) {
//				// [∃]
//			} else if (code >= 0x81da && code <= 0x81dd) {
//				// [∠]～[∂]
//			} else if (code >= 0x81de && code <= 0x81e8) {
//				// [∇]～[∬]
//			} else if (code >= 0x81f0 && code <= 0x81f7) {
//				// [Å]～[¶]
//			} else if (code == 0x81fc) {
//				// [◯]
//			} else if (code >= 0x824f && code <= 0x8258) {
//				// [０]～[９]
//			} else if (code >= 0x8260 && code <= 0x8279) {
//				// [Ａ]～[Ｚ]
//			} else if (code >= 0x8281 && code <= 0x829a) {
//				// [ａ]～[ｚ]
//			} else if (code >= 0xA140 && code <= 0xF97E) {
//				// BIG5码的编码范围是首字节A1-F9，尾字节分两段，分别是40-7E及A1-FE，首字节A1-A3是符号区，A4-C5是常用汉字区。
//				System.out.println(1);
//				if (code >= 0xC6A1 && code <= 0xD7FE) {
//					// BIG5中,C6-C7没有明确定义，但通常用来放日文假名和序号，C8-D7属于罕用汉字区。
//					System.out.println(-1);
//					return false;
//				}
//			} else if (code >= 0xA1A1 && code <= 0xF9FE) {
//				// BIG5码的编码范围是首字节A1-F9，尾字节分两段，分别是40-7E及A1-FE，首字节A1-A3是符号区，A4-C5是常用汉字区。
//				System.out.println(2);
//			}
//			// else if (code >= 0x829f && code <= 0x82f1) {
//			// // [ぁ]～[ん]
//			// }
//			// else if (code >= 0x8340 && code <= 0x8396) {
//			// // [ァ]～[ヶ]
//			// }
//			// else if (code >= 0x839f && code <= 0x83d6) {
//			// // [Α]～[ω]
//			// } else if (code >= 0x8440 && code <= 0x8460) {
//			// // [А]～[Я]
//			// } else if (code >= 0x8470 && code <= 0x8491) {
//			// // [а]～[я]
//			// } else if (code >= 0x849f && code <= 0x84be) {
//			// // [─]～[╂]
//			// // } else if (code >= 0x8740 && code <= 0x879c) {
//			// // // [①]～[∪] : 13区 NEC機種依存文字
//			// // containsExtendedChar = true;
//			// } else if (code >= 0x889f && code <= 0xeaa4) {
//			// // [亜]～[熙]
//			// // } else if (code >= 0xed40 && code <= 0xedfc) {
//			// // // [纊]～[犱] : 89, 90区 NEC選定IBM拡張文字
//			// // containsExtendedChar = true;
//			// // } else if (code >= 0xee40 && code <= 0xeefc) {
//			// // // [珖]～[＂] : 91, 92区 NEC選定IBM拡張文字
//			// // containsExtendedChar = true;
//			// // } else if (code >= 0xfa40 && code <= 0xfafc) {
//			// // // [ⅰ]～[浯] : 115, 116区 IBM拡張文字
//			// // containsExtendedChar = true;
//			// // } else if (code >= 0xfb40 && code <= 0xfbfc) {
//			// // // [涖]～[髙] : 117, 118区 IBM拡張文字
//			// // containsExtendedChar = true;
//			// // } else if (code >= 0xfc40 && code <= 0xfc4b) {
//			// // // [髜]～[黑] : 119区 IBM拡張文字
//			// // containsExtendedChar = true;
//			// }
//			else {
//				res = false;
//			}

			if (!res) {
				hexValue = TextUtils.toHex(str.substring(i, i + 1), "gb2312");
				code = Integer.valueOf(hexValue, 16);
				System.out.println(str.substring(i, i + 1));
				System.out.println("gb:" + hexValue);
				if (code >= 0xA1A1 && code <= 0xF7FE) {
					// GB码的编码范围是首字节A1-F7，尾字节A1-FE，而且首字节A1-A9是符号区，AA-AF这一段没有定义。
				} else {
					return false;
				}
			}
		}

		return true;
	}
}
