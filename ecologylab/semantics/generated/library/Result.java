package ecologylab.semantics.generated.library;

 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
 import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;

@xml_inherit
@xml_tag("result")
public class Result extends Metadata{


/**
	Constructor
**/ 

public Result()
{
 super();
}

/**
	Constructor
**/ 

public Result(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("Title") @xml_nested private MetadataString	Title;

/**
	Lazy Evaluation for Title
**/ 

MetadataString	Title()
{
MetadataString	result	=this.Title;
if(result == null)
{
result = new MetadataString();
this.Title	=	 result;
}
return result;
}

/**
	Gets the value of the field Title
**/ 

public String getTitle(){
return Title().getValue();
}

/**
	Sets the value of the field Title
**/ 

public void setTitle( String Title )
{
this.Title().setValue(Title);
}

/**
	The heavy weight setter method for field Title
**/ 

public void hwSetTitle( String Title )
{
this.Title().setValue(Title);
rebuildCompositeTermVector();
 }
/**
	null
**/ 

	@xml_tag("Summary") @xml_nested private MetadataString	Summary;

/**
	Lazy Evaluation for Summary
**/ 

MetadataString	Summary()
{
MetadataString	result	=this.Summary;
if(result == null)
{
result = new MetadataString();
this.Summary	=	 result;
}
return result;
}

/**
	Gets the value of the field Summary
**/ 

public String getSummary(){
return Summary().getValue();
}

/**
	Sets the value of the field Summary
**/ 

public void setSummary( String Summary )
{
this.Summary().setValue(Summary);
}

/**
	The heavy weight setter method for field Summary
**/ 

public void hwSetSummary( String Summary )
{
this.Summary().setValue(Summary);
rebuildCompositeTermVector();
 }
/**
	null
**/ 

	@xml_tag("Url") @xml_nested private MetadataParsedURL	Url;

/**
	Lazy Evaluation for Url
**/ 

MetadataParsedURL	Url()
{
MetadataParsedURL	result	=this.Url;
if(result == null)
{
result = new MetadataParsedURL();
this.Url	=	 result;
}
return result;
}

/**
	Gets the value of the field Url
**/ 

public ParsedURL getUrl(){
return Url().getValue();
}

/**
	Sets the value of the field Url
**/ 

public void setUrl( ParsedURL Url )
{
this.Url().setValue(Url);
}

/**
	The heavy weight setter method for field Url
**/ 

public void hwSetUrl( ParsedURL Url )
{
this.Url().setValue(Url);
rebuildCompositeTermVector();
 }
/**
	null
**/ 

	@xml_tag("ClickUrl") @xml_nested private MetadataParsedURL	ClickUrl;

/**
	Lazy Evaluation for ClickUrl
**/ 

MetadataParsedURL	ClickUrl()
{
MetadataParsedURL	result	=this.ClickUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.ClickUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field ClickUrl
**/ 

public ParsedURL getClickUrl(){
return ClickUrl().getValue();
}

/**
	Sets the value of the field ClickUrl
**/ 

public void setClickUrl( ParsedURL ClickUrl )
{
this.ClickUrl().setValue(ClickUrl);
}

/**
	The heavy weight setter method for field ClickUrl
**/ 

public void hwSetClickUrl( ParsedURL ClickUrl )
{
this.ClickUrl().setValue(ClickUrl);
rebuildCompositeTermVector();
 }
/**
	null
**/ 

	@xml_tag("DisplayUrl") @xml_nested private MetadataParsedURL	DisplayUrl;

/**
	Lazy Evaluation for DisplayUrl
**/ 

MetadataParsedURL	DisplayUrl()
{
MetadataParsedURL	result	=this.DisplayUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.DisplayUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field DisplayUrl
**/ 

public ParsedURL getDisplayUrl(){
return DisplayUrl().getValue();
}

/**
	Sets the value of the field DisplayUrl
**/ 

public void setDisplayUrl( ParsedURL DisplayUrl )
{
this.DisplayUrl().setValue(DisplayUrl);
}

/**
	The heavy weight setter method for field DisplayUrl
**/ 

public void hwSetDisplayUrl( ParsedURL DisplayUrl )
{
this.DisplayUrl().setValue(DisplayUrl);
rebuildCompositeTermVector();
 }
/**
	null
**/ 

	@xml_tag("ModificationDate") @xml_nested private MetadataInteger	ModificationDate;

/**
	Lazy Evaluation for ModificationDate
**/ 

MetadataInteger	ModificationDate()
{
MetadataInteger	result	=this.ModificationDate;
if(result == null)
{
result = new MetadataInteger();
this.ModificationDate	=	 result;
}
return result;
}

/**
	Gets the value of the field ModificationDate
**/ 

public Integer getModificationDate(){
return ModificationDate().getValue();
}

/**
	Sets the value of the field ModificationDate
**/ 

public void setModificationDate( Integer ModificationDate )
{
this.ModificationDate().setValue(ModificationDate);
}

/**
	The heavy weight setter method for field ModificationDate
**/ 

public void hwSetModificationDate( Integer ModificationDate )
{
this.ModificationDate().setValue(ModificationDate);
rebuildCompositeTermVector();
 }
/**
	null
**/ 

	@xml_tag("MimeType") @xml_nested private MetadataString	MimeType;

/**
	Lazy Evaluation for MimeType
**/ 

MetadataString	MimeType()
{
MetadataString	result	=this.MimeType;
if(result == null)
{
result = new MetadataString();
this.MimeType	=	 result;
}
return result;
}

/**
	Gets the value of the field MimeType
**/ 

public String getMimeType(){
return MimeType().getValue();
}

/**
	Sets the value of the field MimeType
**/ 

public void setMimeType( String MimeType )
{
this.MimeType().setValue(MimeType);
}

/**
	The heavy weight setter method for field MimeType
**/ 

public void hwSetMimeType( String MimeType )
{
this.MimeType().setValue(MimeType);
rebuildCompositeTermVector();
 }}
