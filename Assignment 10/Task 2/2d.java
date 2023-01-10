/*
d)

Positive logical test case
Pre-condition: x > y
Input: x=5, y=2
Output: (5-2)=3
Post-condition: e=3, z = 1+2+3 = 6

Negative logical test case
Pre-condition: x <= y
Input: x=3, y=5
Output: (5-3)=2
Post-condition: e=2, z = 1+2 = 3

Positive concrete test case
Pre-condition: e==0
Input: x=3, y=3
Output: e=0
Post-condition: e=0, z=0

Negative concrete test case
Pre-condition: x=5, y=-3
Input: x=5, y=-3
Output: (5--3)=8
Post-condition: e=8, z=1+2+3+4+5+6+7+8=36
*/


@Test
public void testPositiveLogical() {
    int x = 5;
    int y = 2;
    int expected = 6;
    int result = number(x, y);
    assertEquals(expected, result);
}
@Test
public void testNegativeLogical() {
    int x = 3;
    int y = 5;
    int expected = 3;
    int result = number(x, y);
    assertEquals(expected, result);
}
@Test
public void testPositiveConcrete() {
    int x = 3;
    int y = 3;
    int expected = 0;
    int result = number(x, y);
    assertEquals(expected, result);
}
@Test
public void testNegativeConcrete() {
    int x = 5;
    int y = -3;
    int expected = 36;
    int result = number(x, y);
    assertEquals(expected, result);
}

