package xyz.doikki.videoplayer.render;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;

import androidx.appcompat.view.ContextThemeWrapper;

import com.github.tvbox.osc.R;
import com.lzy.okgo.utils.OkLogger;

public class PlayerViewRenderViewFactory extends RenderViewFactory {
    int renderType;

    public PlayerViewRenderViewFactory(int renderType) {
        this.renderType = renderType;
    }

    public static PlayerViewRenderViewFactory create(int renderType) {
        return new PlayerViewRenderViewFactory(renderType);
    }

    @Override
    public IRenderView createRenderView(Context context) {
        ContextThemeWrapper themeWrapper = new ContextThemeWrapper(context, renderType == 1 ? R.style.surfaceType_surface : R.style.surfaceType_texture);
        try {
            XmlResourceParser xml = themeWrapper.getResources().getXml(R.xml.exo_play_view);
            AttributeSet attrs = Xml.asAttributeSet(xml);
            return new PlayerViewRenderView(themeWrapper, attrs);
        } catch (Throwable t) {
            OkLogger.d("createRenderView  " + Log.getStackTraceString(t));
            return new PlayerViewRenderView(themeWrapper);
        }
    }

}
