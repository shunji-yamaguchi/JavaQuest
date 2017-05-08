package Q14_3;

import java.awt.Image;

/**
 * 次のメソッドとフィールドを持つ、
 * IconInfoというpublicなインタフェースを宣言してください。
 *     ・引数はint型で仮引数の名前はiconType、
 *       戻り値の型はImage型で、名前がgetIconであるメソッド
 *     ・型はintで名前はICON_16x16、値は1であるフィールド
 *     ・型はintで名前はICON_32x32、値は2であるフィールド
*/

public interface IconInfo {
    int ICON_16x16 = 1;
    int ICON_32x32 = 2;

    Image getIcon(int iconType);
}
