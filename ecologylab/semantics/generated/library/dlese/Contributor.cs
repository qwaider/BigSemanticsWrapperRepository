//
// Contributor.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/21/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.dlese;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.dlese 
{
	[SimplInherit]
	public class Contributor : Metadata
	{
		[SimplComposite]
		[MmName("organization")]
		private Organization organization;

		[SimplScalar]
		private MetadataString role;

		[SimplScalar]
		private MetadataInteger date;

		public Contributor()
		{ }

		public Organization Organization
		{
			get{return organization;}
			set{organization = value;}
		}

		public MetadataString Role
		{
			get{return role;}
			set{role = value;}
		}

		public MetadataInteger Date
		{
			get{return date;}
			set{date = value;}
		}
	}
}
