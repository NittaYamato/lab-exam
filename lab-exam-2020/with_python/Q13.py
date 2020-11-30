import MeCab


def print_words_and_results(raw_text: str = 'すもももももももものうち'):
    t = MeCab.Tagger('-Ochasen')
    print(t.parse('すもももももももものうち'))


def print_morpheme(raw_text: str = 'すもももももももものうち'):
    t = MeCab.Tagger('-Ochasen')
    s = [line for line in t.parse('すもももももももものうち').splitlines()
         if '名詞' in line.split()[-1]]
    for str in s:
        print(str.split())


if __name__ == '__main__':
    print_words_and_results()
    print_morpheme()
