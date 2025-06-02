import unittest

def can_drive(age):
    driving_age = 16
    return age >= driving_age

class Test1(unittest.TestCase):
    def test1(test):
        test.assertFalse(can_drive(15), "15 year old cannot drive")

    def test2(test):
        test.assertTrue(can_drive(16), "16 year old can drive")

    def test3(test):
        test.assertTrue(can_drive(18), "18 year old can drive")

    def test4(test):
        test.assertFalse(can_drive(0), "0 year old cannot drive")

    def test5(test):
        test.assertFalse(can_drive(-1), "Preborn cannot drive ")

if __name__ == '__main__':
    unittest.main()
