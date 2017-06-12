package test;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.hasItems;



import org.junit.Before;
import org.junit.Test;

import utilities.Permutation;

public class PermutationTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetAllLists() {
		
		String[] elements 	= {"A","B","C","D"};
		
		assertThat(Arrays.asList(Permutation.getAllLists(elements,1)), 
				hasItems(new String[]{"A","B","C","D"}));
		
		assertThat(Arrays.asList(Permutation.getAllLists(elements,2)), 
				hasItems(new String[]{"AA","AB","AC","AD","BA","BB","BC","BD","CA","CB","CC","CD","DA","DB","DC","DD"}));
		
		assertThat(Arrays.asList(Permutation.getAllLists(elements,3)), 
				hasItems(new String[]{"AAA","AAB","AAC","AAD","ABA","ABB","ABC","ABD","ACA","ACB","ACC","ACD","ADA","ADB","ADC","ADD","BAA","BAB","BAC","BAD","BBA","BBB","BBC","BBD","BCA","BCB","BCC","BCD","BDA","BDB","BDC","BDD","CAA","CAB","CAC","CAD","CBA","CBB","CBC","CBD","CCA","CCB","CCC","CCD","CDA","CDB","CDC","CDD","DAA","DAB","DAC","DAD","DBA","DBB","DBC","DBD","DCA","DCB","DCC","DCD","DDA","DDB","DDC","DDD"}));
		
		assertThat(Arrays.asList(Permutation.getAllLists(elements,4)), 
				hasItems(new String[]{"AAAA","AAAB","AAAC","AAAD","AABA","AABB","AABC","AABD","AACA","AACB","AACC","AACD","AADA","AADB","AADC","AADD","ABAA","ABAB","ABAC","ABAD","ABBA","ABBB","ABBC","ABBD","ABCA","ABCB","ABCC","ABCD","ABDA","ABDB","ABDC","ABDD","ACAA","ACAB","ACAC","ACAD","ACBA","ACBB","ACBC","ACBD","ACCA","ACCB","ACCC","ACCD","ACDA","ACDB","ACDC","ACDD","ADAA","ADAB","ADAC","ADAD","ADBA","ADBB","ADBC","ADBD","ADCA","ADCB","ADCC","ADCD","ADDA","ADDB","ADDC","ADDD","BAAA","BAAB","BAAC","BAAD","BABA","BABB","BABC","BABD","BACA","BACB","BACC","BACD","BADA","BADB","BADC","BADD","BBAA","BBAB","BBAC","BBAD","BBBA","BBBB","BBBC","BBBD","BBCA","BBCB","BBCC","BBCD","BBDA","BBDB","BBDC","BBDD","BCAA","BCAB","BCAC","BCAD","BCBA","BCBB","BCBC","BCBD","BCCA","BCCB","BCCC","BCCD","BCDA","BCDB","BCDC","BCDD","BDAA","BDAB","BDAC","BDAD","BDBA","BDBB","BDBC","BDBD","BDCA","BDCB","BDCC","BDCD","BDDA","BDDB","BDDC","BDDD","CAAA","CAAB","CAAC","CAAD","CABA","CABB","CABC","CABD","CACA","CACB","CACC","CACD","CADA","CADB","CADC","CADD","CBAA","CBAB","CBAC","CBAD","CBBA","CBBB","CBBC","CBBD","CBCA","CBCB","CBCC","CBCD","CBDA","CBDB","CBDC","CBDD","CCAA","CCAB","CCAC","CCAD","CCBA","CCBB","CCBC","CCBD","CCCA","CCCB","CCCC","CCCD","CCDA","CCDB","CCDC","CCDD","CDAA","CDAB","CDAC","CDAD","CDBA","CDBB","CDBC","CDBD","CDCA","CDCB","CDCC","CDCD","CDDA","CDDB","CDDC","CDDD","DAAA","DAAB","DAAC","DAAD","DABA","DABB","DABC","DABD","DACA","DACB","DACC","DACD","DADA","DADB","DADC","DADD","DBAA","DBAB","DBAC","DBAD","DBBA","DBBB","DBBC","DBBD","DBCA","DBCB","DBCC","DBCD","DBDA","DBDB","DBDC","DBDD","DCAA","DCAB","DCAC","DCAD","DCBA","DCBB","DCBC","DCBD","DCCA","DCCB","DCCC","DCCD","DCDA","DCDB","DCDC","DCDD","DDAA","DDAB","DDAC","DDAD","DDBA","DDBB","DDBC","DDBD","DDCA","DDCB","DDCC","DDCD","DDDA","DDDB","DDDC","DDDD"}));		
	}
}
