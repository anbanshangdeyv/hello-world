package shiyan;

import java.util.Scanner;

//��������������ü���������ɣ�һ���͹��˰ɡ�
//��Ҫ���ף����һ��ռ����İٷ�֮��ʮ��
//һ�н�����齫һ����Ҫ������
public class jisuanqi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * JAVA����ʹ��Scanner���ȡ����ʱ(ʹ�ñ���������Ҳ��˽�)����Ҫʹ�� try{}+finally{
		 * input(����Scanner�Ķ�����input).close }����ֹ����Դй¶��input ��δ�رա�
		 * ���ǣ�һ����������������try�ж���ı���ʹ�ú���ͷţ�������ʱҪ�������Scanner�����õ���ֵ������try�����
		 * ���������try��ʹ���㶨������Ǿ���tryǰ����ж��� ��Java��ʹ��Scanner
		 * �������󣬲�������Ϊ���������ʱ����Ҷ���Ϊ�˲��ڷ���ִ��ʱ���������Ծ���������close������
		 * ����Scanner��ʹ�ã�������Ϊ��ֻҪ�����һ��Scanner���󣬾�˳�������Ķ��ص��ˡ�����������̨����ʱ��
		 * �ͻ������������.�����Ұѹر��������˸���������//**�������������ȫ���ˣ����ǹر������������У�����������Ҫ�رղ�����ȷ
		 */

		// int jiSuanQi;//**��仰д������Ҳ�ǿ��Եģ�����Scanner�Ķ���Զ��������Ӱ���

		// ����Scanner���󣬽��ܴӿ���̨����
		Scanner input = new Scanner(System.in);// ���̾������Ϊinputδ�رգ��رշ��ں�������
		int jiSuanQi;
		try {
			for (;;) {
				daYinCaiDan();
				jiSuanQi = input.nextInt();
				// System.out.println("��ѡ��ļ�����Ϊ"+jiSuanQi+"�ż�����");
				/*
				 * Scanner input2=new Scanner(System.in); try { int jiSuanQi2=input2.nextInt();
				 * System.out.println("��ѡ��ļ�����Ϊ"+jiSuanQi2+"�ż�����"); } finally { input2.close();
				 * }
				 */// **���������׼���//***��������(�������ø��ֺ���ʱ����)��1.ȷ��Scanner ����try�Ƿ�����������ֺ�����
					// ***2.ȷ��1������ǿ��ԣ���ô��ô����ʲô�׶ˡ�

				/*
				 * finally //{ // input.close(); }
				 */
				// System.out.println(jiSuanQi);

				if (jiSuanQi == 1) {
					System.out.println("\n\n\n\n\n" + "��ѡ��ļ�����Ϊ�Ӽ��˳��������������Խ��мӼ��˳�ȡ����㣩");
					JJCC();

				} else if (jiSuanQi == 2) {
					jinZhiZhuanHuan  a =new jinZhiZhuanHuan();
					a.run();

					break;
				} else if (jiSuanQi == 3) {
					tongJi();
					
					break;
				} else {
					System.out.println("�������������");

					break;
				}
			}
		} finally {
			input.close();
		}

	}
	//tongJi���ܣ�ͳ���������
	//˼·������һ�����������洢���ݣ�Ȼ�����������洢����ӡ
	public static void tongJi() {
		double arr[]=new double[10];
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫͳ�Ƶ���");
		double sum=0;
		for(int i=0;i<10;i++) {
			double num=input.nextDouble();
			arr[i]=num;
			sum+=num;	
		}
		System.out.println("���������Ϊ:");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]);
		}
		System.out.println("����������ܺ�Ϊ:"+sum);
		System.out.println("�������ֵΪ:");
		getMax(arr);
		System.out.println("������СֵΪ:");
		getMin(arr);
		System.out.println("�Ӵ�С����Ϊ��");
		paiXu(arr);
		System.out.println(" "+"\n");
		System.out.println("��С��������Ϊ��");
		paiXu2(arr);
	}
	//getMax���ܣ���ȡ���ֵ����ӡ
	public static void getMax(double arr[]) {
		double max=arr[0];
		for(int i=1;i<10;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
				
		}
		System.out.println(max);
		
	}
	//getMax���ܣ���ȡ��Сֵ����ӡ
		public static void getMin(double arr[]) {
			double min=arr[0];
			for(int i=1;i<10;i++) {
				if(min>arr[i]) {
					min=arr[i];
				}
					
			}
			System.out.println(min);
			
		}
	//paiXu����:�Ӵ�Сѡ������double��������,����ӡ
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
		//paiXu2����:��С����ѡ������double��������,����ӡ
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
	 * daYinCaiDan���ܣ���ӡѡ��������Ĳ˵�
	 */
	public static void daYinCaiDan() {
		System.out.println("��ӭʹ�ü���ϵͳ");
		System.out.println("��ѡ����Ҫ�õļ�����");
		System.out.println("1.�Ӽ��˳�������" + "\n" + "2.����ת��������" + "\n" + "3.ͳ�Ƽ�����");

	}

	/*
	 * JJCC���ܣ��Ӽ��˳�ȡ������(������Ϊʲô�Ӽ��˳�����������ȡ�࣬�Ĵ�������������ǳ�ʶ��)
	 */
	public static void JJCC() {
		double yi, er;
		String fuhao;
		double num1 = 0;
		double sum;//��ζ�����Ϊ������
		for (;;) {
			// Scanner��û���ṩֱ�ӽ���һ���ַ��ķ���,�������Ե����ַ��������ա�
			Scanner input = new Scanner(System.in); //***q��ŵ�ѭ���������Ǹ�true����ʹ�ں�break������Ҳ����̾��
			System.out.print("(��������ֵ)\n\n" + "\t\t");
			yi = input.nextDouble();
			sum = yi;// С����(���ȼ�)
			q: do {
				w: do {
					System.out.print("(�����������)" + "\t");
					fuhao = input.next();
					if (fuhao.equals("0"))
						break q;// **Ϊʲô��break����Ϊwhile����ִ�е�����������ǰfuhaoΪ0��������fuhaoΪ0�����ǻ����ִ�еģ�
					            //Ȼ��fuhaoֵ������,�����������ˡ���������������������������������������
					if (fuhao.equals("=")) {
						break w;
					}

					System.out.print("(��������ֵ)" + "\t");
					er = input.nextDouble();// �����ͱ�����������С��
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

					// String�ıȽϲ�Ӧ����==����Ӧ����equals������fuhao=="+"�ĳ�fuhao.equals("+")�ͺ���
					// ifȡ����1����0����ǿתΪ����
					// ѭ�����˳�ѭ����
					// ***1.����������һ����2.�����3.���ȼ�//***ɶ���ȼ����ţ�
				} while (!fuhao.equals("="));
				er = num1;
				System.out.println("\t      " + "��������������");

				if (sum % 1 == 0 || sum == 0) {
					// *** (int)(sum);//Ϊɶ��仰�Ǵ�ģ���ֱ��������У�
					System.out.println("\t\t" + (int) (sum));
				} else {
					System.out.println("\t" + sum);
				}
				System.out.println("�����˳���ǰ�ۻ�����");
				/*
				 * if(fuhao.equals("0")) break q;//***����������//�жϷ�������ǰ���ˣ��ж����˲���������ԣ���
				 */
				/*String ceshi = input.next();
				if(ceshi.equals("0")) {
					break q;//**Ĭ���˳�����ѭ��//�������д�����һ����������0����ֵ����������������Ұ�ֵ���fuhao��*/

			} while (!fuhao.equals("0"));
			System.out.println("�Ƿ����ʹ�ô˼�������" + "\n" + "1.����                2.�˳�");
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
		 * ***�������⣬Ϊʲô��仰�ᱨ���ֱ�������û�£� (int)(yi+er); System.out.println("=" + (int) (yi +
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
		 */// �������try��finally���ʱ�������к������Scanner��ر�

	}

}
//ʹ���������ķ�����������ת��
class jinZhiZhuanHuan {
	// run���ܣ����н���ת����
	void run() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("��������Ҫ����ת������");
			int num = input.nextInt();
			System.out.println("��������Ҫת���Ľ���(Ŀǰ��֧��10ת2��4��8��16)");
			int base = input.nextInt();
			int offset = 0;
			int temp2=base;//���幤��temp2�洢base��ֵ
			while(base != 0) {
				base %= 2;/*baseֵ�ı�����Ǹ�ԭ*/
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
