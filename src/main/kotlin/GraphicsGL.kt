import color.ColorUtil
import org.lwjgl.opengl.GL11
import java.awt.*
import java.awt.font.FontRenderContext
import java.awt.font.GlyphVector
import java.awt.geom.AffineTransform
import java.awt.image.BufferedImage
import java.awt.image.BufferedImageOp
import java.awt.image.ImageObserver
import java.awt.image.RenderedImage
import java.awt.image.renderable.RenderableImage
import java.text.AttributedCharacterIterator


class GraphicsGL : Graphics2D() {

    private var background: Color =  Color.BLACK;
    private var color: Color =  Color.WHITE;
    private var colorUtil: ColorUtil = ColorUtil();

    fun applyColor(color: Int){
        val f = (color shr 24 and 255).toFloat() / 255.0f
        val f1 = (color shr 16 and 255).toFloat() / 255.0f
        val f2 = (color shr 8 and 255).toFloat() / 255.0f
        val f3 = (color and 255).toFloat() / 255.0f
        GL11.glColor4f(f1, f2, f3, f)
    }

    override fun create(): Graphics {
        TODO("Not yet implemented")
    }

    override fun translate(x: Int, y: Int) {
        TODO("Not yet implemented")
    }

    override fun translate(tx: Double, ty: Double) {
        TODO("Not yet implemented")
    }

    override fun getColor(): Color {
        TODO("Not yet implemented")
    }

    override fun setColor(c: Color?) {
        TODO("Not yet implemented")
    }

    override fun setPaintMode() {
        TODO("Not yet implemented")
    }

    override fun setXORMode(c1: Color?) {
        TODO("Not yet implemented")
    }

    override fun getFont(): Font {
        TODO("Not yet implemented")
    }

    override fun setFont(font: Font?) {
        TODO("Not yet implemented")
    }

    override fun getFontMetrics(f: Font?): FontMetrics {
        TODO("Not yet implemented")
    }

    override fun getClipBounds(): Rectangle {
        TODO("Not yet implemented")
    }

    override fun clipRect(x: Int, y: Int, width: Int, height: Int) {
        TODO("Not yet implemented")
    }

    override fun setClip(x: Int, y: Int, width: Int, height: Int) {
        TODO("Not yet implemented")
    }

    override fun setClip(clip: Shape?) {
        TODO("Not yet implemented")
    }

    override fun getClip(): Shape {
        TODO("Not yet implemented")
    }

    override fun copyArea(x: Int, y: Int, width: Int, height: Int, dx: Int, dy: Int) {
        TODO("Not yet implemented")
    }

    override fun drawLine(x1: Int, y1: Int, x2: Int, y2: Int) {
        TODO("Not yet implemented")
    }

    override fun fillRect(x1: Int, y1: Int, width: Int, height: Int) {
        GL11.glPushMatrix()
        //enableBlend
        GL11.glEnable(3042)
        GL11.glDisable(3553)
        GL11.glBlendFunc(770, 771)
        GL11.glEnable(2848)
        GL11.glPushMatrix()
        applyColor(colorUtil.getColor(background));
        GL11.glBegin(7)
        val x2: Int = x1 + width;
        val y2: Int = y1 + height;
        GL11.glVertex2d(x2 as Double, y1 as Double)
        GL11.glVertex2d(x1 as Double, y1 as Double)
        GL11.glVertex2d(x1 as Double, y2 as Double)
        GL11.glVertex2d(x2 as Double, y2 as Double)
        GL11.glEnd()
        GL11.glPopMatrix()
        GL11.glEnable(3553)
        GL11.glDisable(3042)
        GL11.glDisable(2848)
        //disable blend
        GL11.glPopMatrix()
    }

    override fun clearRect(x: Int, y: Int, width: Int, height: Int) {
        TODO("Not yet implemented")
    }

    override fun drawRoundRect(x: Int, y: Int, width: Int, height: Int, arcWidth: Int, arcHeight: Int) {
        TODO("Not yet implemented")
    }

    override fun fillRoundRect(x: Int, y: Int, width: Int, height: Int, arcWidth: Int, arcHeight: Int) {
        TODO("Not yet implemented")
    }

    override fun drawOval(x: Int, y: Int, width: Int, height: Int) {
        TODO("Not yet implemented")
    }

    override fun fillOval(x: Int, y: Int, width: Int, height: Int) {
        TODO("Not yet implemented")
    }

    override fun drawArc(x: Int, y: Int, width: Int, height: Int, startAngle: Int, arcAngle: Int) {
        TODO("Not yet implemented")
    }

    override fun fillArc(x: Int, y: Int, width: Int, height: Int, startAngle: Int, arcAngle: Int) {
        TODO("Not yet implemented")
    }

    override fun drawPolyline(xPoints: IntArray?, yPoints: IntArray?, nPoints: Int) {
        TODO("Not yet implemented")
    }

    override fun drawPolygon(xPoints: IntArray?, yPoints: IntArray?, nPoints: Int) {
        TODO("Not yet implemented")
    }

    override fun fillPolygon(xPoints: IntArray?, yPoints: IntArray?, nPoints: Int) {
        TODO("Not yet implemented")
    }

    override fun drawString(str: String, x: Int, y: Int) {
        TODO("Not yet implemented")
    }

    override fun drawString(str: String?, x: Float, y: Float) {
        TODO("Not yet implemented")
    }

    override fun drawString(iterator: AttributedCharacterIterator?, x: Int, y: Int) {
        TODO("Not yet implemented")
    }

    override fun drawString(iterator: AttributedCharacterIterator?, x: Float, y: Float) {
        TODO("Not yet implemented")
    }

    override fun drawImage(img: Image?, xform: AffineTransform?, obs: ImageObserver?): Boolean {
        TODO("Not yet implemented")
    }

    override fun drawImage(img: BufferedImage?, op: BufferedImageOp?, x: Int, y: Int) {
        TODO("Not yet implemented")
    }

    override fun drawImage(img: Image?, x: Int, y: Int, observer: ImageObserver?): Boolean {
        TODO("Not yet implemented")
    }

    override fun drawImage(img: Image?, x: Int, y: Int, width: Int, height: Int, observer: ImageObserver?): Boolean {
        TODO("Not yet implemented")
    }

    override fun drawImage(img: Image?, x: Int, y: Int, bgcolor: Color?, observer: ImageObserver?): Boolean {
        TODO("Not yet implemented")
    }

    override fun drawImage(
        img: Image?,
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        bgcolor: Color?,
        observer: ImageObserver?
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun drawImage(
        img: Image?,
        dx1: Int,
        dy1: Int,
        dx2: Int,
        dy2: Int,
        sx1: Int,
        sy1: Int,
        sx2: Int,
        sy2: Int,
        observer: ImageObserver?
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun drawImage(
        img: Image?,
        dx1: Int,
        dy1: Int,
        dx2: Int,
        dy2: Int,
        sx1: Int,
        sy1: Int,
        sx2: Int,
        sy2: Int,
        bgcolor: Color?,
        observer: ImageObserver?
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun dispose() {
        TODO("Not yet implemented")
    }

    override fun draw(s: Shape?) {
        TODO("Not yet implemented")
    }

    override fun drawRenderedImage(img: RenderedImage?, xform: AffineTransform?) {
        TODO("Not yet implemented")
    }

    override fun drawRenderableImage(img: RenderableImage?, xform: AffineTransform?) {
        TODO("Not yet implemented")
    }

    override fun drawGlyphVector(g: GlyphVector?, x: Float, y: Float) {
        TODO("Not yet implemented")
    }

    override fun fill(s: Shape?) {
        TODO("Not yet implemented")
    }

    override fun hit(rect: Rectangle?, s: Shape?, onStroke: Boolean): Boolean {
        TODO("Not yet implemented")
    }

    override fun getDeviceConfiguration(): GraphicsConfiguration {
        TODO("Not yet implemented")
    }

    override fun setComposite(comp: Composite?) {
        TODO("Not yet implemented")
    }

    override fun setPaint(paint: Paint?) {
        TODO("Not yet implemented")
    }

    override fun setStroke(s: Stroke?) {
        TODO("Not yet implemented")
    }

    override fun setRenderingHint(hintKey: RenderingHints.Key?, hintValue: Any?) {
        TODO("Not yet implemented")
    }

    override fun getRenderingHint(hintKey: RenderingHints.Key?): Any {
        TODO("Not yet implemented")
    }

    override fun setRenderingHints(hints: MutableMap<*, *>?) {
        TODO("Not yet implemented")
    }

    override fun addRenderingHints(hints: MutableMap<*, *>?) {
        TODO("Not yet implemented")
    }

    override fun getRenderingHints(): RenderingHints {
        TODO("Not yet implemented")
    }

    override fun rotate(theta: Double) {
        TODO("Not yet implemented")
    }

    override fun rotate(theta: Double, x: Double, y: Double) {
        TODO("Not yet implemented")
    }

    override fun scale(sx: Double, sy: Double) {
        TODO("Not yet implemented")
    }

    override fun shear(shx: Double, shy: Double) {
        TODO("Not yet implemented")
    }

    override fun transform(Tx: AffineTransform?) {
        TODO("Not yet implemented")
    }

    override fun setTransform(Tx: AffineTransform?) {
        TODO("Not yet implemented")
    }

    override fun getTransform(): AffineTransform {
        TODO("Not yet implemented")
    }

    override fun getPaint(): Paint {
        TODO("Not yet implemented")
    }

    override fun getComposite(): Composite {
        TODO("Not yet implemented")
    }

    override fun setBackground(color: Color?) {
        TODO("Not yet implemented")
    }

    override fun getBackground(): Color {
        TODO("Not yet implemented")
    }

    override fun getStroke(): Stroke {
        TODO("Not yet implemented")
    }

    override fun clip(s: Shape?) {
        TODO("Not yet implemented")
    }

    override fun getFontRenderContext(): FontRenderContext {
        TODO("Not yet implemented")
    }
}