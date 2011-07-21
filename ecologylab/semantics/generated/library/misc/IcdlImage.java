package ecologylab.semantics.generated.library.misc;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.builtins.Image;

/**
*  IcdlImage.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Image from The Interantional Children's digital library.
 */ 
@simpl_inherit
public class IcdlImage extends Image
{
	/** 
	 * The language of the library
	 */ 
	@simpl_scalar	private MetadataString languages;

	public IcdlImage()
	{ }

	public IcdlImage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	languages()
	{
		MetadataString	result = this.languages;
		if (result == null)
		{
			result = new MetadataString();
			this.languages = result;
		}
		return result;
	}

	public String getLanguages()
	{
		return this.languages().getValue();
	}

	public MetadataString getLanguagesMetadata()
	{
		return languages;
	}

	public void setLanguages(String languages)
	{
		this.languages().setValue(languages);
	}

	public void setLanguagesMetadata(MetadataString languages)
	{
		this.languages = languages;
	}
}
