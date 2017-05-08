package Q14_4;

/**
 * 以下のMyMediaPlayableインタフェースを拡張して、
 * MySoundPlayableという名前のサブインタフェースを宣言してむださい。
 * 追加するメソッドは以下のgetSoundNameです。
 *     String getSoundName();
 * MyMediaPlayableインタフェース
 *
 * interface MyMediaPlayable {
 *     void play();
 *     void stop();
 *     void loop();
 * }
 */

interface MyMediaPlayable {
    void play();

    void stop();

    void loop();
}

interface MySoundName extends MyMediaPlayable {
    String getSoundName();
}
