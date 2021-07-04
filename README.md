# Switch-Between-Activities
## Aktiviteler arası geçiş Intent yardımıyla olmaktadır. 
<p><b>onCreate() :</b> Aktivite ekranda görünmeden hemen önce yürütülür. Burada, Aktivite hakkında görsel bir izlenim edinmeden önce gerçekleşmesi gereken ayarları ekleyebilirsiniz.<br>
<b>onCreateOptionsMenu() : </b> Kullanıcı seçenekler menüsünü istediğinde çalıştırılır.<br>
<b>onOptionsItemSelected() :</b> kullanıcı seçenekler menüsünden bir öğe seçtiğinde yürütülür.
</p><br>
<h2>Ilk aktivite:<br>
  
  ![firstActivity](https://github.com/isilay-subasi/Switch-Between-Activities/blob/main/images/firsActivitiy.PNG)
  
</h2><br>
<h2>Ikinci aktivite:<br>
  
  ![secondActivity](https://github.com/isilay-subasi/Switch-Between-Activities/blob/main/images/secondActivity.PNG)
 
</h2><br> 


# Aktiviteler Arası Veri Aktarımı
## Veriler, onu başlatan Intent nesnesi aracılığıyla başka bir Aktiviteye iletilir.
## Yaptığımız şey, değeri ve gerçek değeri tanımlayan bir anahtar olmak üzere iki parametre alan çeşitli<b> putExtra() </b>yöntemlerini kullanarak Intent içinde iletmek istediğimiz değerleri paketlemektir
- Intentle gelen verileri almak için de diğer aktivitede <b>getStringExtra()</b> kullanılır.

