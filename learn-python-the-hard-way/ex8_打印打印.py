#ϰ��8����ӡ�� ��ӡ

formatter = "%r %r %r %r"

print formatter % (1, 2, 3, 4)

#ע���ӡ�����ǵ����ţ���python���ȴ�ӡ�������ţ���
print formatter % ("one", "two", "three", "four")

#ע���Сд����д���ǲ���ֵ��Сд����δ֪������Ҫô��ֵ��Ҫô�����ŵ��ַ���
print formatter % (True, 'false', False, "true")

#��formatter���ַ�����ӡ������ע������ʹ���˵����ţ�
print formatter %(formatter, formatter, formatter, formatter)

#
print formatter % (
    "I had this thing.",
    "That you could type up right.",
    "But it didn't sing.",
    "So I said goodnight.",
)
