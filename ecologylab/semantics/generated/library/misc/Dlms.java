package ecologylab.semantics.generated.library.misc;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;

/**
*  Dlms.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The DLMS Class
 */ 
@simpl_inherit
public class Dlms extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString subject;

	public Dlms()
	{ }

	public Dlms(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	subject()
	{
		MetadataString	result = this.subject;
		if (result == null)
		{
			result = new MetadataString();
			this.subject = result;
		}
		return result;
	}

	public String getSubject()
	{
		return this.subject == null ? null : subject().getValue();
	}

	public MetadataString getSubjectMetadata()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		if (subject != null)
			this.subject().setValue(subject);
	}

	public void setSubjectMetadata(MetadataString subject)
	{
		this.subject = subject;
	}
}
