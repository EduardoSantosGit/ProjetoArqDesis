package TO;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ListarClienteTO extends ArrayList <ClienteTO>{
	
	
	private static final long serialVersionUID = 1L;
	
	public String toJSON(){
		JSONArray v = new JSONArray();
		Locale local = new Locale("pt","BR");
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT, local);
		for(ClienteTO to:this){
			JSONObject obj = new JSONObject();
			try {
				obj.put("email", to.email); 
				obj.put("telefone", to.telefone);
				obj.put("endereco", to.endereco);
				obj.put("sexo", to.sexo);
				obj.put("validade", to.validade);
				obj.put("cateHabi", to.cateHabi);
				obj.put("estadoEmi", to.estadoEmi);
				obj.put("numHabi", to.numHabi);
				obj.put("dataNasc", (to.dataNasc != null?f.format(to.dataNasc):""));
				obj.put("RG", to.RG);
				obj.put("CPF", to.CPF);
				obj.put("nome", to.nome);
				v.put(obj);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return v.toString();	
	}

}
