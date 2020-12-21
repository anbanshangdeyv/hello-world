package shiyan;

import java.util.Scanner;

//这个计算器打算用几个类来完成？一个就够了吧。
//你要明白，最后一步占总体的百分之九十。
//一切皆像打麻将一样，要打打绝。
public class jisuanqi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * JAVA中在使用Scanner类获取输入时(使用别的类的情况我不了解)，需要使用 try{}+finally{
		 * input(这里Scanner的对象是input).close }来防止“资源泄露：input 从未关闭”
		 * 但是，一旦有了这两个，在try中定义的变量使用后会释放，所以这时要想调用用Scanner类所得到的值必须在try中完成
		 * 如果你想在try外使用你定义变量那就在try前面进行定义 在Java中使用Scanner
		 * 创建对象，并用其作为输入的容器时，大家都会为了不在翻译执行时报错，都会自觉加上它的close函数，
		 * 但是Scanner的使用，总是认为，只要你关了一个Scanner对象，就顺带其他的都关掉了。在真正控制台运行时，
		 * 就会出现两个错误.这里我把关闭设立在了各个函数中//**结果函数运行完全关了，于是关闭设在主函数中，各个函数不要关闭才是正确
		 */

		// int jiSuanQi;//**这句话写在这里也是可以的，创建Scanner的对象对定义变量无影响的

		// 创建Scanner对象，接受从控制台输入
		Scanner input = new Scanner(System.in);// 这个叹号是因为input未关闭，关闭放在函数中了
		int jiSuanQi;
		try {
			for (;;) {
				daYinCaiDan();
				jiSuanQi = input.nextInt();
				// System.out.println("您选择的计算器为"+jiSuanQi+"号计算器");
				/*
				 * Scanner input2=new Scanner(System.in); try { int jiSuanQi2=input2.nextInt();
				 * System.out.println("您选择的计算器为"+jiSuanQi2+"号计算器"); } finally { input2.close();
				 * }
				 */// **这种情况是准许的//***遗留问题(熟练运用各种函数时来看)，1.确认Scanner 类中try是否可以塞进各种函数、
					// ***2.确认1后如果是可以，那么这么做有什么弊端。

				/*
				 * finally //{ // input.close(); }
				 */
				// System.out.println(jiSuanQi);

				if (jiSuanQi == 1) {
					System.out.println("\n\n\n\n\n" + "您选择的计算器为加减乘除计算器（您可以进行加减乘除取余计算）");
					JJCC();

				} else if (jiSuanQi == 2) {
					jinZhiZhuanHuan  a =new jinZhiZhuanHuan();
					a.run();

					break;
				} else if (jiSuanQi == 3) {
					tongJi();
					
					break;
				} else {
					System.out.println("输入错误请重试");

					break;
				}
			}
		} finally {
			input.close();
		}

	}
	//tongJi功能：统计输入的数
	//思路：定义一个数组用来存储数据，然后输入数，存储，打印
	public static void tongJi() {
		double arr[]=new double[10];
		Scanner input=new Scanner(System.in);
		System.out.println("请输入需要统计的数");
		double sum=0;
		for(int i=0;i<10;i++) {
			double num=input.nextDouble();
			arr[i]=num;
			sum+=num;	
		}
		System.out.println("您输入的数为:");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]);
		}
		System.out.println("您输入的数总和为:"+sum);
		System.out.println("其中最大值为:");
		getMax(arr);
		System.out.println("其中最小值为:");
		getMin(arr);
		System.out.println("从大到小排序为：");
		paiXu(arr);
		System.out.println(" "+"\n");
		System.out.println("从小到大排序为：");
		paiXu2(arr);
	}
	//getMax功能：获取最大值并打印
	public static void getMax(double arr[]) {
		double max=arr[0];
		for(int i=1;i<10;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
				
		}
		System.out.println(max);
		
	}
	//getMax功能：获取最小值并打印
		public static void getMin(double arr[]) {
			double min=arr[0];
			for(int i=1;i<10;i++) {
				if(min>arr[i]) {
					min=arr[i];
				}
					
			}
			System.out.println(min);
			
		}
	//paiXu功能:从大到小选择排序double类形数组,并打印
		public static void paiXu(double arr[]) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<10;j++) {
					if(arr[i]<arr[j]) {
						double temp;
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<10;i++) {
				System.out.print(arr[i]+"  ");
			}
		}
		//paiXu2功能:从小到大选择排序double类形数组,并打印
				public static void paiXu2(double arr[]) {
					for(int i=0;i<arr.length-1;i++) {
						for(int j=i+1;j<10;j++) {
							if(arr[i]>arr[j]) {
								double temp;
								temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
						}
					}
					for(int i=0;i<10;i++) {
						System.out.print(arr[i]+"  ");
					}
				}

	/*
	 * daYinCaiDan功能：打印选择计算器的菜单
	 */
	public static void daYinCaiDan() {
		System.out.println("欢迎使用计算系统");
		System.out.println("请选择您要用的计算器");
		System.out.println("1.加减乘除计算器" + "\n" + "2.进制转换计算器" + "\n" + "3.统计计算器");

	}

	/*
	 * JJCC功能：加减乘除取余运算(别问我为什么加减乘除计算器会有取余，四大天王有五个不是常识吗？)
	 */
	public static void JJCC() {
		double yi, er;
		String fuhao;
		double num1 = 0;
		double sum;//多次定义是为了区分
		for (;;) {
			// Scanner类没有提供直接接受一个字符的方法,不过可以当做字符串来接收。
			Scanner input = new Scanner(System.in); //***q标号的循环条件若是改true，即使内涵break，这行也会有叹号
			System.out.print("(请输入数值)\n\n" + "\t\t");
			yi = input.nextDouble();
			sum = yi;// 小括号(优先级)
			q: do {
				w: do {
					System.out.print("(请输入运算符)" + "\t");
					fuhao = input.next();
					if (fuhao.equals("0"))
						break q;// **为什么加break？因为while不是执行的条件是运行前fuhao为0而运行中fuhao为0他还是会继续执行的，
					            //然后fuhao值被覆盖,条件又满足了。。。。。。。。。。。。。。。。。。。。
					if (fuhao.equals("=")) {
						break w;
					}

					System.out.print("(请输入数值)" + "\t");
					er = input.nextDouble();// 除数和被除数可能是小数
					if (fuhao.equals("+")) {
						sum += er;
					}
					if (fuhao.equals("-")) {
						sum -= er;
					}
					if (fuhao.equals("*")) {
						sum *= er;
					}
					if (fuhao.equals("/")) {
						sum /= er;
					}
					if (fuhao.equals("%")) {
						sum %= er;
					}

					// String的比较不应该用==，而应该是equals函数，fuhao=="+"改成fuhao.equals("+")就好了
					// if取余与1等于0，则强转为整形
					// 循环，退出循环。
					// ***1.改善下面那一堆撒2.归零√3.优先级//***啥优先级来着？
				} while (!fuhao.equals("="));
				er = num1;
				System.out.println("\t      " + "———————");

				if (sum % 1 == 0 || sum == 0) {
					// *** (int)(sum);//为啥这句话是错的？而直接输出就行？
					System.out.println("\t\t" + (int) (sum));
				} else {
					System.out.println("\t" + sum);
				}
				System.out.println("归零退出当前累积运算");
				/*
				 * if(fuhao.equals("0")) break q;//***来个解释撒//判断放在输入前面了，判断完了才输入的所以，死
				 */
				/*String ceshi = input.next();
				if(ceshi.equals("0")) {
					break q;//**默认退出最里循环//如果这样写会产生一个除了输入0其他值无意义的数，所以我把值输给fuhao了*/

			} while (!fuhao.equals("0"));
			System.out.println("是否继续使用此计算器？" + "\n" + "1.继续                2.退出");
			yi = input.nextDouble();
			if (yi == 2) {
				System.out.println();
				break;
			}
			if (yi == 1) {

			}

		}

		/*
		 * if (fuhao.equals("+")) { if ((yi + er) % 1 == 0 || (yi + er) == 0) { //
		 * ***遗留问题，为什么这句话会报错而直接输出就没事？ (int)(yi+er); System.out.println("=" + (int) (yi +
		 * er)); } else System.out.println("=" + (yi + er)); } else if
		 * (fuhao.equals("-")) { if ((yi - er) % 1 == 0 || (yi - er) == 0) {
		 * System.out.println("=" + (int) (yi - er)); } else System.out.println("=" +
		 * (yi - er)); } else if (fuhao.equals("*")) { if ((yi * er) % 1 == 0 || (yi *
		 * er) == 0) { System.out.println("=" + (int) (yi * er)); } else
		 * System.out.println("=" + (yi * er)); } else if (fuhao.equals("/")) { if ((yi
		 * / er) % 1 == 0 || (yi / er) == 0) { System.out.println("=" + (int) (yi /
		 * er)); } else System.out.println("=" + (yi / er)); } else if
		 * (fuhao.equals("%")) { if ((yi % er) % 1 == 0 || (yi % er) == 0) {
		 * System.out.println("=" + (int) (yi % er)); } else System.out.println("=" +
		 * (yi % er)); }
		 */// 函数里加try和finally语句时会在运行后把所有Scanner类关闭

	}

}
//使用面向对象的方法做出进制转换
class jinZhiZhuanHuan {
	// run功能：进行进制转换。
	void run() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入需要进制转换的数");
			int num = input.nextInt();
			System.out.println("请输入需要转换的进制(目前仅支持10转2、4、8、16)");
			int base = input.nextInt();
			int offset = 0;
			int temp2=base;//定义工具temp2存储base的值
			while(base != 0) {
				base %= 2;/*base值改变后忘记复原*/
				offset++;
			}
			base=temp2;	
			if (num == 0) {
				System.out.println(0);
			}
			char[] chs = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
			char[] arr = new char[32];
			int pos = arr.length;
			while(num!=0) {
				int temp = num & (base - 1);
				arr[--pos] = chs[temp];
				num = num >>> offset;
			}
			for (int x = pos; x < arr.length; x++) {
				System.out.println(arr[x]);
			}
		} finally {
			input.close();
		}

	}

}
