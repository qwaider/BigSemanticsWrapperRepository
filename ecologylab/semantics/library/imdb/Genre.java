package ecologylab.semantics.library.imdb;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.builtins.Entity;

 import java.util.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.net.ParsedURL;
import ecologylab.generic.HashMapArrayList;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;

@xml_inherit
@xml_tag("genre")
public class Genre extends Metadata{


/**
	Constructor
**/ 

public Genre()
{
 super();
}

/**
	Constructor
**/ 

public Genre(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("name") @xml_nested private MetadataString	name;

/**
	Lazy Evaluation for name
**/ 

public MetadataString	name()
{
MetadataString	result	=this.name;
if(result == null)
{
result = new MetadataString();
this.name	=	 result;
}
return result;
}

/**
	Gets the value of the field name
**/ 

public String getName(){
return name().getValue();
}

/**
	Sets the value of the field name
**/ 

public void setName( String name )
{
this.name().setValue(name);
}

/**
	The heavy weight setter method for field name
**/ 

public void hwSetName( String name )
{
this.name().setValue(name);
rebuildCompositeTermVector();
 }
/**
	 Sets the name directly
**/ 

public void setNameMetadata(MetadataString name)
{	this.name = name;
}
/**
	Heavy Weight Direct setter method for name
**/ 

public void hwSetNameMetadata(MetadataString name)
{	 if(this.name!=null && this.name.getValue()!=null && hasTermVector())
		 termVector().remove(this.name.termVector());
	 this.name = name;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("genre_link") @xml_nested private MetadataParsedURL	genreLink;

/**
	Lazy Evaluation for genreLink
**/ 

public MetadataParsedURL	genreLink()
{
MetadataParsedURL	result	=this.genreLink;
if(result == null)
{
result = new MetadataParsedURL();
this.genreLink	=	 result;
}
return result;
}

/**
	Gets the value of the field genreLink
**/ 

public ParsedURL getGenreLink(){
return genreLink().getValue();
}

/**
	Sets the value of the field genreLink
**/ 

public void setGenreLink( ParsedURL genreLink )
{
this.genreLink().setValue(genreLink);
}

/**
	The heavy weight setter method for field genreLink
**/ 

public void hwSetGenreLink( ParsedURL genreLink )
{
this.genreLink().setValue(genreLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the genreLink directly
**/ 

public void setGenreLinkMetadata(MetadataParsedURL genreLink)
{	this.genreLink = genreLink;
}
/**
	Heavy Weight Direct setter method for genreLink
**/ 

public void hwSetGenreLinkMetadata(MetadataParsedURL genreLink)
{	 if(this.genreLink!=null && this.genreLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.genreLink.termVector());
	 this.genreLink = genreLink;
	rebuildCompositeTermVector();
}}