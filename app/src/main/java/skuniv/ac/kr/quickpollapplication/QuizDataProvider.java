package skuniv.ac.kr.quickpollapplication;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.GsonBuilder;

import java.net.HttpURLConnection;
import java.util.List;




/**
 * Created by gunyoungkim on 2017-09-07.
 */

public class QuizDataProvider {
    public List<QuizData> FatchNurseList(){
        String url="http://117.17.142.135:8080/controller/Nurse?a=nurseList";
        HttpRequest request=HttpRequest.get(url);
        request.contentType( HttpRequest.CONTENT_TYPE_JSON );
        request.accept( HttpRequest.CONTENT_TYPE_JSON );
        request.connectTimeout( 1000 );
        request.readTimeout( 3000 );
        int responseCode = request.code();
        if ( responseCode != HttpURLConnection.HTTP_OK  ) {
            throw new RuntimeException("HTTP Response Exception : "+responseCode);
        }
        JSONResultFatchQuizDataList result=new GsonBuilder().create().fromJson(request.bufferedReader(),JSONResultFatchQuizDataList.class);
        if("success".equals(result.getResult())==false){
            throw new RuntimeException("JSONResultFatchUserList Response Exception: "+result.getMessage());
        }
        return result.getData();
    }
    private class JSONResultFatchQuizDataList extends JsonResult<List<QuizData>> {}
}
