package model;

import org.json.JSONException;
import org.json.JSONObject;

public class Submission {
	JSONObject json;
	private Long id;
	private String lang;
	private String lang_name;
	private String time;
	private int status;
	private String status_display;
	private String runtime;
	private String url;
	private String is_pending;
	private String title;
	private String memory;
	private String code;
	private String ext;

	public Submission(Long id, String lang, String lang_name, String time, int status, String status_display,
			String runtime, String url, String is_pending, String title, String memory, String code) throws JSONException {
		super();
		this.id = id;
		this.lang = lang;
		this.lang_name = lang_name;
		this.time = time;
		this.status = status;
		this.status_display = status_display;
		this.runtime = runtime;
		this.url = url;
		this.is_pending = is_pending;
		this.title = title;
		this.memory = memory;
		this.code = code;
		json = new JSONObject();
		json.put("id", id);
		json.put("lang", lang);
		json.put("lang_name", lang_name);
		json.put("time", time);
		json.put("status", status);
		json.put("status_display", status_display);
		json.put("runtime", runtime);
		json.put("url", url);
		json.put("is_pending", is_pending);
		json.put("title", title);
		json.put("memory", memory);
		json.put("code", code);

	}

	public Submission(JSONObject json) throws JSONException {
		id = json.getLong("id");
		lang = json.getString("lang");
		lang_name = json.getString("lang_name");
		time = json.getString("time");
		status = json.getInt("status");
		status_display = json.getString("status_display");
		runtime = json.getString("runtime");
		url = json.getString("url");
		is_pending = json.getString("is_pending");
		title = json.getString("title");
		memory = json.getString("memory");
		code = json.getString("code");
		this.json = json;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang_name() {
		return lang_name;
	}

	public void setLang_name(String lang_name) {
		this.lang_name = lang_name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getStatus_display() {
		return status_display;
	}

	public void setStatus_display(String status_display) {
		this.status_display = status_display;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIs_pending() {
		return is_pending;
	}

	public void setIs_pending(String is_pending) {
		this.is_pending = is_pending;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		try {
			return json.toString(2);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	//fill this later
	public String getExt() {
		if (lang.equals("java"))
			return ".java";
		if (lang.equals("python"))
			return ".py";
		if (lang.equals("C"))
			return ".c";
		return "";
	}

}
