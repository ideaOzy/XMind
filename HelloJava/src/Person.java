
class Person { // ����Person��
	private String name; // ����
	private int age; // ����

	public Person(String name, int age) { // ͨ�����췽����ֵ
		name = name;
		age = age;
	}

	public String getInfo() { // ȡ����Ϣ�ķ���
		return "������" + name + "�����䣺" + age;
	}
}

