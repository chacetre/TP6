package fr.esilv.tp6;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by Charlotte on 26/02/2016.
 */
public class VideoDetails extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;

    private YoutubeVideo video ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videochoisiview);

        video = (YoutubeVideo) getIntent().getSerializableExtra("video");

        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize("AIzaSyAN_vNoKojmtZi2Uyq4Vfnj9HlsnEo8YEg", this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo(video.id.videoId); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
