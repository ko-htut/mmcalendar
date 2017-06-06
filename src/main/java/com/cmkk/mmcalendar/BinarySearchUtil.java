package com.cmkk.mmcalendar;

/**
 * <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * @author Chan Mrate Ko Ko
 * @version 1.0
 *
 */
public class BinarySearchUtil {

	/**
	 * Search first dimension in a 2D array
	 * @param k key
	 * @param A array
	 * @return index
	 */
	public static int search(double k, int[][] A) {
		int i = 0;
		int l = 0;
		int u = A.length - 1;
		while (u >= l) {
			i = (int) Math.floor((l + u) / 2.0);
			if (A[i][0] > k) {
				u = i - 1;
			} else if (A[i][0] < k) {
				l = i + 1;
			} else {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Search first dimension in a 1D array
	 * @param k key
	 * @param A array
	 * @return index
	 */
	public static int search(double k, int[] A) {
		int i = 0;
		int l = 0;
		int u = A.length - 1;

		while (u >= l) {
			i = (int) Math.floor((l + u) / 2.0);
			if (A[i] > k) {
				u = i - 1;
			} else if (A[i] < k) {
				l = i + 1;
			} else {
				return i;
			}
		}
		return -1;
	}
}