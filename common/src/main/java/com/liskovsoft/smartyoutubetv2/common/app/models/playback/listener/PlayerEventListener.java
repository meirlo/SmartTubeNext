package com.liskovsoft.smartyoutubetv2.common.app.models.playback.listener;

import com.liskovsoft.smartyoutubetv2.common.app.models.data.Video;
import com.liskovsoft.smartyoutubetv2.common.app.models.playback.controller.PlaybackController;

// is paused, position, tracks (audio, video, subs), codecs, aspect, speed
// title, subtitle (description), subscribed/liked nums, published date, toggle buttons, simple buttons
public interface PlayerEventListener extends PlayerUiEventListener, PlayerEngineEventListener, ViewEventListener {
    void openVideo(Video item);
    void setController(PlaybackController controller);
    void setParentView(Object parentView);
}