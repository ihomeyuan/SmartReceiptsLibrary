package co.smartreceipts.android.workers.reports.pdf.pdfbox;


import android.content.Context;
import android.support.annotation.StringRes;

import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;

public interface PdfBoxContext {

    FontSpec getDefaultFont();
    FontSpec getTitleFont();
    FontSpec getSmallFont();

    int getLineSpacing();
    int getPageMarginHorizontal();
    int getPageMarginVertical();
    String getString(@StringRes int resId, Object... args);

    String getDateSeparator();

    Context getApplicationContext();

    /**
     * Use {@link PDPage#getMediaBox()}.getHeight() instead
     * @return
     */
    @Deprecated
    PDRectangle getPageSize();

    class FontSpec {
        private final PDFont font;
        private final int size;

        public FontSpec(PDFont font, int size) {
            this.font = font;
            this.size = size;
        }

        public PDFont getFont() {
            return font;
        }

        public int getSize() {
            return size;
        }
    }
}